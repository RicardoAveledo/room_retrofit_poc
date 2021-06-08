package es.diusframi.orionlogisticsmobile.ui.ubicarUL;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.room.Room;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeFailureEvent;
import com.honeywell.aidc.BarcodeReadEvent;
import com.honeywell.aidc.BarcodeReader;
import com.honeywell.aidc.TriggerStateChangeEvent;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import es.diusframi.orionlogisticsmobile.R;
import es.diusframi.orionlogisticsmobile.daos.OLMDatabase;
import es.diusframi.orionlogisticsmobile.daos.UserDao;
import es.diusframi.orionlogisticsmobile.models.Almacen;
import es.diusframi.orionlogisticsmobile.models.GetDataService;
import es.diusframi.orionlogisticsmobile.models.ULRecepcion;
import es.diusframi.orionlogisticsmobile.models.User;
import es.diusframi.orionlogisticsmobile.network.RetrofitClientInstance;
import es.diusframi.orionlogisticsmobile.ui.LoginActivity;
import es.diusframi.orionlogisticsmobile.ui.MainActivity;
import es.diusframi.orionlogisticsmobile.ui.scanner.ScannerActivity;
import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UbicarULDetalleActivity extends AppCompatActivity  implements BarcodeReader.BarcodeListener,
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
    public Button validarButton;
    //public Spinner almacenesSpinner;

    // True si el código del UL se escaneó. False si se escribió manual
    public Boolean checkScanner = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicar_u_l_detalle);
        setTitle("UBICAR UL");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String jsonMyObject = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            jsonMyObject = extras.getString("ulRecepcion");
            checkScanner1 = extras.getBoolean("scanned1");
        }


        //Toast.makeText(mContext, checkScanner1+ "", Toast.LENGTH_SHORT).show();

        try {
            final ULRecepcion ulRecepcion = new Gson().fromJson(jsonMyObject, ULRecepcion.class);


        edCode = (EditText)findViewById(R.id.editTextCode);
        validarButton = (Button)findViewById(R.id.validateButton);
        TextView tvCodigoUlNombre = (TextView)findViewById(R.id.codigoNombreText);
        TextView tvAlmacen = (TextView)findViewById(R.id.codigoNombreAlmacenText);
        TextView tvCompleta = (TextView)findViewById(R.id.completaText);
        TextView tvUbicacionAlmacen = (TextView)findViewById(R.id.ubicacionCodigoNombreAlmacenText);



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
                    //Toast.makeText(mContext, checkScanner+"", Toast.LENGTH_SHORT).show();


                }

                @Override
                public void afterTextChanged(Editable editable) {
                }
            });


        try {
            tvCodigoUlNombre.setText(ulRecepcion.getUl() + " - " + ulRecepcion.getDescripcion());
            tvAlmacen.setText(ulRecepcion.getCodigo_almacen() + " - " + ulRecepcion.getNombre_almacen());

            if (ulRecepcion.getCompleta()) {
                tvCompleta.setTextColor(ContextCompat.getColor(mContext, R.color.verde_boton));
                tvCompleta.setText("COMPLETA");
            } else {
                tvCompleta.setTextColor(ContextCompat.getColor(mContext, R.color.red_error));
                tvCompleta.setText("INCOMPLETA");
            }
            tvUbicacionAlmacen.setText(ulRecepcion.getUbicar_en() + " - " + ulRecepcion.getNombre_ubicar_en());

        } catch (Exception e) {
            e.printStackTrace();
        }

        validarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = null;
                try {
                    code = edCode.getText().toString();
                if (code.equals(ulRecepcion.getUbicar_en())) {

                    //Almacen almacenSelected = new Gson().fromJson(new Gson().toJson(almacenesSpinner.getSelectedItem()), Almacen.class);

                    GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                    Call<String> recepcionCall = service.ulRecepcion("1",
                            ulRecepcion.getUl(),
                            ulRecepcion.getCodigo_almacen(),
                            ulRecepcion.getCodigo_ubicacion(),
                            ulRecepcion.getCodigo_almacen(),
                            ulRecepcion.getUbicar_en(),
                            ulRecepcion.isEscaneado());
                    recepcionCall.enqueue(new Callback<String>() {
                        @Override
                        public void onResponse(Call<String> token, Response<String> response) {
                            String user = response.body();
                            String stringResponse = null;
                            String errorMsg = null;
                            try {
                                stringResponse = response.errorBody().string();
                                JSONObject json = new JSONObject(stringResponse);
                                errorMsg = json.get("result").toString();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                                String title = "";
                                String msg = "";

                                if (errorMsg != null) {
                                    title = "¡Error!";
                                    msg = "errorMsg";
                                } else {
                                    title = "Movivimento Correcto:";
                                    msg = "Por favor, coloque ahora la UL en la ubicación indicada";
                                }

                                AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                                alertDialog.setTitle(title);
                                alertDialog.setMessage(msg);
                                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                dialog.dismiss();
                                                finish();
                                            }
                                        });
                                alertDialog.show();
                        }

                        @Override
                        public void onFailure(Call<String> call, Throwable t) {

                            Toast.makeText(UbicarULDetalleActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                    alertDialog.setTitle("¡Error!");
                    alertDialog.setMessage("No ha ingresado o escaneado la UL correcta, intente nuevamente");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                } catch (Exception e) {
                    e.printStackTrace();
                    AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                    alertDialog.setTitle("¡Error!");
                    alertDialog.setMessage("Problemas de conexión con el Servidor, intente nuevamente.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    finish();
                                }
                            });
                    alertDialog.show();
                }

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

        AidcManager.create(UbicarULDetalleActivity.this, new AidcManager.CreatedCallback() {
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
                            barcodeReader.addBarcodeListener(UbicarULDetalleActivity.this);
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

                //try {
                //    edCode.setText("");
                //    if(scannerSwitch){
                //        scannerSwitch = !scannerSwitch;
                //        barcodeReader = manager.createBarcodeReader();
                //        barcodeReader.claim();
                //        barcodeReader.aim(true);
                //        barcodeReader.light(true);
                //        barcodeReader.decode(true);
                //        barcodeReader.addBarcodeListener(UbicarULDetalleActivity.this);
                //    } else {
                //        scannerSwitch = !scannerSwitch;
                //        barcodeReader.release();
                //        barcodeReader.close();
                //    }
                //} catch (Exception e) {
                //    e.printStackTrace();
                //    Intent intent = new Intent(mContext, ScannerActivity.class);
                //    startActivityForResult(intent, ScannerActivity.SCANNER_ACTIVITY_RESULT);
                //}
            }
        });



    }


    @Override
    public void onBarcodeEvent(BarcodeReadEvent barcodeReadEvent) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    edCode.setText(barcodeReadEvent.getBarcodeData());
                    scannerSwitch = true;
                    if (Utilidades.opcionEscaneoRapido.equals("Si")) {
                        validarButton.callOnClick();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
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