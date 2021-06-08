package es.diusframi.orionlogisticsmobile.ui.movimientoUL;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;
import androidx.room.Room;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.google.gson.Gson;
import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeFailureEvent;
import com.honeywell.aidc.BarcodeReadEvent;
import com.honeywell.aidc.BarcodeReader;
import com.honeywell.aidc.ScannerNotClaimedException;
import com.honeywell.aidc.ScannerUnavailableException;
import com.honeywell.aidc.TriggerStateChangeEvent;
import com.honeywell.aidc.UnsupportedPropertyException;

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
import es.diusframi.orionlogisticsmobile.ui.scanner.ScannerActivity;
import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;
import okhttp3.internal.Util;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovimientoULActivity extends AppCompatActivity implements BarcodeReader.BarcodeListener,
        BarcodeReader.TriggerListener {

    Context mContext;
    EditText edCode;

    private String mConnectedScanner = null;
    private Button mSwitchScannersButton;
    private ListView barcodeList;
    private boolean mResume = false;


    private static BarcodeReader barcodeReader;
    private AidcManager manager;

    public boolean scannerSwitch = true;

    public int charsize = 0;
    public int charcomparatorfirst = 0;
    public int charcomparatorsecond = 0;
    public boolean scannedText = true;
    public Button buttonValidate;

    // True si el código del UL se escaneó. False si se escribió manual
    public Boolean checkScanner = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_movimiento_u_l);
        setTitle("Movimiento UL");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView buttonScan = (ImageView)findViewById(R.id.scanButton);
        edCode = (EditText)findViewById(R.id.editTextCode);
        buttonValidate = (Button)findViewById(R.id.searchButton);
        Spinner almacenesSpinner = (Spinner)findViewById(R.id.almacenesSpinner);

        ArrayAdapter<Almacen> dataAdapter = new ArrayAdapter<Almacen>(this,
                android.R.layout.simple_spinner_item, Utilidades.almacenes);


        almacenesSpinner.setAdapter(dataAdapter);



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
                //Toast.makeText(MovimientoULActivity.this, checkScanner+"", Toast.LENGTH_SHORT).show();



            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

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

        AidcManager.create(MovimientoULActivity.this, new AidcManager.CreatedCallback() {
            @Override
            public void onCreated(AidcManager aidcManager) {
                manager = aidcManager;
            }
        });



        buttonScan.setOnClickListener(new View.OnClickListener() {
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
                            barcodeReader.addBarcodeListener(MovimientoULActivity.this);
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

        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //DELETE THIS:
                //Intent intent = new Intent(mContext, UbicarULDetalleActivity.class);
                //startActivity(intent);
                //DELETE ABOVE


                String codeScanned = edCode.getText().toString();
                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                Call<ULRecepcion> callUlRecepcion = service.ulRecepcion(codeScanned);
                callUlRecepcion.enqueue(new Callback<ULRecepcion>() {
                    @Override
                    public void onResponse(Call<ULRecepcion> token, Response<ULRecepcion> response) {
                        ULRecepcion ulRecepcion = response.body();

                        if(response.body()==null){
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
                           Intent intent = new Intent(mContext, MovimientoULDetalleActivity.class);
                           intent.putExtra("ulRecepcion", new Gson().toJson(ulRecepcion));
                           intent.putExtra("scanned1", checkScanner);
                           intent.putExtra("almacenorigen",new Gson().toJson(almacenesSpinner.getSelectedItem()));
                           ActivityOptions options =
                                   ActivityOptions.makeCustomAnimation(mContext, R.anim.fragment_fade_enter, R.anim.fragment_fade_exit);
                           startActivity(intent, options.toBundle());
                           edCode.setText("");
                        }


                    }

                    @Override
                    public void onFailure(Call<ULRecepcion> call, Throwable t) {

                        Toast.makeText(MovimientoULActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                    }
                });



            }
        });



    }


    @Override
    public void onResume() {
        super.onResume();
        //edCode.setText("");
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onBarcodeEvent(BarcodeReadEvent barcodeReadEvent) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                edCode.setText(barcodeReadEvent.getBarcodeData());
                scannerSwitch = true;
                if(Utilidades.opcionEscaneoRapido.equals("Si")){
                    buttonValidate.callOnClick();
                }
            }
        });
    }

    @Override
    public void onFailureEvent(BarcodeFailureEvent barcodeFailureEvent) {
        edCode.setText("");
        scannerSwitch = true;
        if(Utilidades.opcionEscaneoRapido.equals("Si")){
            buttonValidate.callOnClick();
        }
    }

    @Override
    public void onTriggerEvent(TriggerStateChangeEvent triggerStateChangeEvent) {

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
                        buttonValidate.callOnClick();
                    }
                }
            }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}