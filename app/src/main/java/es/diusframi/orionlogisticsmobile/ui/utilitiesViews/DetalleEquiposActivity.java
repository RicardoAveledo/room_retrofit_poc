package es.diusframi.orionlogisticsmobile.ui.utilitiesViews;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeFailureEvent;
import com.honeywell.aidc.BarcodeReadEvent;
import com.honeywell.aidc.BarcodeReader;
import com.honeywell.aidc.TriggerStateChangeEvent;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import es.diusframi.orionlogisticsmobile.R;
import es.diusframi.orionlogisticsmobile.models.Almacen;
import es.diusframi.orionlogisticsmobile.models.Equipo;
import es.diusframi.orionlogisticsmobile.models.GetDataService;
import es.diusframi.orionlogisticsmobile.models.ULRecepcion;
import es.diusframi.orionlogisticsmobile.network.RetrofitClientInstance;
import es.diusframi.orionlogisticsmobile.ui.movimientoUL.MovimientoEquiposActivity;
import es.diusframi.orionlogisticsmobile.ui.movimientoUL.MovimientoULDetalleActivity;
import es.diusframi.orionlogisticsmobile.ui.scanner.ScannerActivity;
import es.diusframi.orionlogisticsmobile.ui.viewsAdapters.EquiposAdapter;
import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetalleEquiposActivity extends AppCompatActivity  implements BarcodeReader.BarcodeListener,
        BarcodeReader.TriggerListener {

Context mContext;
EditText edCode;

private static BarcodeReader barcodeReader;
private AidcManager manager;
public boolean scannerSwitch = true;
public boolean checkScanner1 = false;
public int charcomparatorfirst = 0;
public int charcomparatorsecond = 0;
public boolean scannedText = true;
public boolean completa = true;
public Equipo equipoToAdd;
public List<Equipo> equipoList;
public Button validarButton;

// True si el código del UL se escaneó. False si se escribió manual
public Boolean checkScanner = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_equipos);

        setTitle("DETALLE EQUIPO");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        try {

            edCode = (EditText)findViewById(R.id.editTextCodeEquipo);
            validarButton = (Button)findViewById(R.id.searchButtonEquipo);



            //With this we validate that the code of the UL was not introduced manually.
            edCode.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    charcomparatorfirst = charSequence.length();
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //charsize++;
                    charcomparatorsecond = charSequence.length();
                    Boolean check1 = true;
                    Boolean check2 = true;

                    if((charcomparatorfirst+1)==charcomparatorsecond){
                        check1 = false;
                    }

                    if((charcomparatorfirst-1)==charcomparatorsecond){
                        check2 = false;
                    }

                    if(!(check1 && check2)){
                        checkScanner = false;
                    }else{
                        checkScanner = true;
                    }
                   // Toast.makeText(mContext, checkScanner+"", Toast.LENGTH_SHORT).show();


                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });



            validarButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        //ACÁ PONER LA LISTA DE EQUIPOS.
                        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                        String codeScanned = edCode.getText().toString();
                        Call<List<Equipo>> callEquipo = service.serieEquipo(codeScanned);
                        callEquipo.enqueue(new Callback<List<Equipo>>() {
                            @Override
                            public void onResponse(Call<List<Equipo>> token, Response<List<Equipo>> response) {
                                equipoList = null;
                                try {
                                    if (response.body() == null) {
                                        try {
                                            String stringResponse = response.errorBody().string();
                                            JSONObject json = new JSONObject(stringResponse);
                                            String errorMsg = json.get("result").toString();
                                            AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                                            alertDialog.setTitle("¡Error!");
                                            alertDialog.setMessage(errorMsg);
                                            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                                    new DialogInterface.OnClickListener() {
                                                        public void onClick(DialogInterface dialog, int which) {
                                                            dialog.dismiss();
                                                        }
                                                    });
                                            alertDialog.show();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        equipoList = response.body();
                                        equipoToAdd = null;
                                        boolean checkIfAdded = false;
                                        if (equipoList.size() > 1) {
                                            AlertDialog.Builder alertDialogList = new AlertDialog.Builder(DetalleEquiposActivity.this);
                                            alertDialogList.setIcon(R.drawable.ic_launcher);
                                            alertDialogList.setTitle("Múltiples equipos encontrados");
                                           // alertDialogList.setMessage("Escoge el equipo a ver en detalle:");

                                            final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(DetalleEquiposActivity.this, android.R.layout.select_dialog_singlechoice);
                                            for (int i = 0; i < equipoList.size(); i++) {
                                                arrayAdapter.add(equipoList.get(i).getDescripcion());
                                            }

                                            alertDialogList.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });

                                            alertDialogList.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialog, int which) {
                                                    equipoToAdd = equipoList.get(which);
                                                    int valorScanner = 0;
                                                    if (checkScanner) {
                                                        valorScanner = 1;
                                                    } else {
                                                        valorScanner = 0;
                                                    }
                                                    equipoToAdd.setSerie_escaneado(valorScanner);
                                                    Utilidades.showEquipoDetalle(equipoToAdd, mContext);
                                                }
                                            });
                                            alertDialogList.show();
                                        } else {
                                            equipoToAdd = equipoList.get(0);
                                            int valorScanner = 0;
                                            if (checkScanner) {
                                                valorScanner = 1;
                                            } else {
                                                valorScanner = 0;
                                            }
                                            equipoToAdd.setSerie_escaneado(valorScanner);
                                            Utilidades.showEquipoDetalle(equipoToAdd, mContext);
                                        }
                                    }

                                    //for(int i=0; i<equipoList.size(); i++){
                                    //    // Acá agregar la validación de si el Almacén que escogí es el almacén
                                    //    // en el que estoy y es el mismo del UL que muevo y del equipo.
                                    //    // Preguntar por esta validación.
                                    //    if(equipoList.get(i).getAlmacen().equals(Utilidades.almacenes.get(0).getId())){
                                    //        equipoToAdd = equipoList.get(i);
                                    //        checkIfAdded = true;
                                    //    }
                                    //}
                                    //if(equipoToAdd == null){
                                    //    equipoToAdd = equipoList.get(0);
                                    //}
                                    //if(equipoToAdd == null){
                                    //    AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                                    //    alertDialog.setTitle("Error");
                                    //    alertDialog.setMessage("Número de Serie no encontrado en el Almacen: "+almacenSelected.getText());
                                    //    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                    //            new DialogInterface.OnClickListener() {
                                    //                public void onClick(DialogInterface dialog, int which) {
                                    //                    dialog.dismiss();
                                    //                }
                                    //            });
                                    //    alertDialog.show();
                                   // } else {
                                    //}
                                } catch (Exception e) {
                                    e.printStackTrace();


                                    AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                                    alertDialog.setTitle("Error");
                                    alertDialog.setMessage("Número de Serie no encontrado");
                                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                            new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {
                                                    dialog.dismiss();
                                                }
                                            });
                                    alertDialog.show();
                                }
                            }
                            @Override
                            public void onFailure(Call<List<Equipo>> call, Throwable t) {
                                Toast.makeText(mContext, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                            }
                        });

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (barcodeReader != null) {

            // register bar code event listener

            //mBarcodeReader.addBarcodeListener((BarcodeReader.BarcodeListener) mContext);
            //mBarcodeReader.addTriggerListener((BarcodeReader.TriggerListener) mContext);


            Map<String, Object> properties = new HashMap<String, Object>();
            // Set Symbologies On/Off
            properties.put(BarcodeReader.PROPERTY_CODE_128_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_GS1_128_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_QR_CODE_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_CODE_39_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_DATAMATRIX_ENABLED, true);
            properties.put(BarcodeReader.PROPERTY_UPC_A_ENABLE, true);
            properties.put(BarcodeReader.PROPERTY_EAN_13_ENABLED, false);
            properties.put(BarcodeReader.PROPERTY_AZTEC_ENABLED, false);
            properties.put(BarcodeReader.PROPERTY_CODABAR_ENABLED, false);
            properties.put(BarcodeReader.PROPERTY_INTERLEAVED_25_ENABLED, false);
            properties.put(BarcodeReader.PROPERTY_PDF_417_ENABLED, false);
            // Set Max Code 39 barcode length
            properties.put(BarcodeReader.PROPERTY_CODE_39_MAXIMUM_LENGTH, 10);
            // Turn on center decoding
            properties.put(BarcodeReader.PROPERTY_CENTER_DECODE, true);
            // Disable bad read response, handle in onFailureEvent
            properties.put(BarcodeReader.PROPERTY_NOTIFICATION_BAD_READ_ENABLED, false);
            // Apply the settings
            try {
                barcodeReader.setProperties(properties);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        AidcManager.create(DetalleEquiposActivity.this, new AidcManager.CreatedCallback() {
            @Override
            public void onCreated(AidcManager aidcManager) {
                manager = aidcManager;
            }
        });


        ImageView scanButton = (ImageView)findViewById(R.id.scanButton);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Utilidades.opcionDispositivoEscaneo.equals("Escáner")){
                    try {
                        edCode.setText("");
                        if(scannerSwitch){
                            scannerSwitch = !scannerSwitch;
                            barcodeReader = manager.createBarcodeReader();
                            barcodeReader.claim();
                            barcodeReader.aim(true);
                            barcodeReader.light(true);
                            barcodeReader.decode(true);
                            barcodeReader.addBarcodeListener(DetalleEquiposActivity.this);
                        } else {
                            scannerSwitch = !scannerSwitch;
                            barcodeReader.release();
                            barcodeReader.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Utilidades.changeDispositivoEscaneoToCamera(mContext);
                        AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("No se ha encontrado el escáner, abriendo la cámara");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                        Intent intent = new Intent(mContext, ScannerActivity.class);
                                        startActivityForResult(intent, ScannerActivity.SCANNER_ACTIVITY_RESULT);
                                    }
                                });
                        alertDialog.show();
                    }
                }else{
                    Intent intent = new Intent(mContext, ScannerActivity.class);
                    startActivityForResult(intent, ScannerActivity.SCANNER_ACTIVITY_RESULT);
                }



            }
        });



    }


    @Override
    public void onBarcodeEvent(BarcodeReadEvent barcodeReadEvent) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                edCode.setText(barcodeReadEvent.getBarcodeData());
                scannerSwitch = true;
                if(Utilidades.opcionEscaneoRapido.equals("Si")){
                    validarButton.callOnClick();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        //edCode.setText("");
        super.onResume();
    }

    @Override
    public void onFailureEvent(BarcodeFailureEvent barcodeFailureEvent) {
        edCode.setText("");
        scannerSwitch = true;
        if(Utilidades.opcionEscaneoRapido.equals("Si")){
            validarButton.callOnClick();
        }
    }

    @Override
    public void onTriggerEvent(TriggerStateChangeEvent triggerStateChangeEvent) {

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK)
            if (requestCode == ScannerActivity.SCANNER_ACTIVITY_RESULT) {
                String barcode = data.getExtras().getString(ScannerActivity.READED_CODE);
                if (barcode != null){
                    edCode.setText(barcode.toUpperCase(Locale.getDefault()));
                    if(Utilidades.opcionEscaneoRapido.equals("Si")){
                        validarButton.callOnClick();
                    }
                }
            }
    }
}