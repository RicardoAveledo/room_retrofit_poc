package es.diusframi.orionlogisticsmobile.ui.movimientoUL;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.content.ContextCompat;
        import androidx.recyclerview.widget.RecyclerView;

        import android.app.Activity;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.text.Editable;
        import android.text.TextWatcher;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Spinner;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.gson.Gson;
        import com.google.gson.JsonArray;
        import com.google.gson.JsonObject;
        import com.honeywell.aidc.AidcManager;
        import com.honeywell.aidc.BarcodeFailureEvent;
        import com.honeywell.aidc.BarcodeReadEvent;
        import com.honeywell.aidc.BarcodeReader;
        import com.honeywell.aidc.TriggerStateChangeEvent;

        import org.json.JSONObject;
        import org.w3c.dom.Text;

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
        import es.diusframi.orionlogisticsmobile.ui.scanner.ScannerActivity;
        import es.diusframi.orionlogisticsmobile.ui.viewsAdapters.EquiposAdapter;
        import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;
        import okhttp3.internal.Util;
        import retrofit2.Call;
        import retrofit2.Callback;
        import retrofit2.Response;

public class MovimientoEquiposActivity extends AppCompatActivity implements BarcodeReader.BarcodeListener,
        BarcodeReader.TriggerListener {

    public static Context mContext;
    EditText edCode;

    private static BarcodeReader barcodeReader;
    private AidcManager manager;
    public boolean scannerSwitch = true;
    public boolean checkScanner1 = false;
    public int charcomparatorfirst = 0;
    public int charcomparatorsecond = 0;
    public boolean scannedText = true;
    public boolean completa = true;
    public boolean tipoEnvioCheck = true;

    public static ULRecepcion ulRecepcion;
    public static List<Equipo> listEquiposToSend = new ArrayList<>();
    public static ListView listViewEquipos;
    public Almacen almacenOrigen;
    public Button validarButton;

    // True si el código del UL se escaneó. False si se escribió manual
    public Boolean checkScanner = false;

    // En las ventanas donde se utilice el AlertDialog para escanear items adicionales, este check
    // servirá para detectar cuál será el edittext que lo llama.
    public String tipoScanner = "";

    public TextView codMoveED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimiento_equipos);
        setTitle("Movimiento UL");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        String jsonMyObject = "";
        String jsonMyObjectEquipo = "";
        String jsonMyObjectAlmacen = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            jsonMyObjectEquipo = extras.getString("equipoToAdd");
            jsonMyObject = extras.getString("ulRecepcion");
            checkScanner1 = extras.getBoolean("scanned1");


            jsonMyObjectAlmacen = extras.getString("almacenorigen");

            almacenOrigen = new Gson().fromJson(jsonMyObjectAlmacen, Almacen.class);
        }

        final Equipo equipoToAdd = new Gson().fromJson(jsonMyObjectEquipo, Equipo.class);

        TextView textDescripcion = (TextView)findViewById(R.id.textDescription);

        listViewEquipos = (ListView) findViewById(R.id.listViewEquipos);

        listEquiposToSend = new ArrayList<>();
        listEquiposToSend.add(equipoToAdd);
        EquiposAdapter equiposAdapter = new EquiposAdapter(mContext,listEquiposToSend);

        listViewEquipos.setAdapter(equiposAdapter);

        //Toast.makeText(mContext, checkScanner1+ "", Toast.LENGTH_SHORT).show();

        edCode = (EditText)findViewById(R.id.editTextCode);
        validarButton = (Button)findViewById(R.id.validateButton);
        Button sendEquiposButton = (Button)findViewById(R.id.sendEquipos);
        TextView tvCodigoUlNombre = (TextView)findViewById(R.id.codigoNombreText);
        TextView tvAlmacen = (TextView)findViewById(R.id.codigoNombreAlmacenText);
        TextView tvCompleta = (TextView)findViewById(R.id.completaText);
        TextView tvUbicacionAlmacen = (TextView)findViewById(R.id.ubicacionCodigoNombreAlmacenText);

        try {
            ulRecepcion = new Gson().fromJson(jsonMyObject, ULRecepcion.class);





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
                        //ACÁ PONER LA LISTA DE EQUIPOS.
                    GetDataService service = null;
                    try {
                        service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                    String codeScanned = edCode.getText().toString();
                        Call<List<Equipo>> callEquipo = service.serieEquipo(codeScanned);
                        callEquipo.enqueue(new Callback<List<Equipo>>() {
                            @Override
                            public void onResponse(Call<List<Equipo>> token, Response<List<Equipo>> response) {
                                List<Equipo> equipoList = null;
                                try {
                                    equipoList = response.body();
                                Equipo equipoToAdd = null;
                                boolean checkIfAdded = false;
                                for(int i=0; i<equipoList.size(); i++){
                                    // Acá agregar la validación de si el Almacén que escogí es el almacén
                                    // en el que estoy y es el mismo del UL que muevo y del equipo.
                                    // Preguntar por esta validación.
                                    if(equipoList.get(i).getAlmacen().equals(almacenOrigen.getId())){
                                        equipoToAdd = equipoList.get(i);
                                        checkIfAdded = true;
                                    }
                                }
                                if(equipoToAdd == null) {
                                    equipoToAdd = equipoList.get(0);
                                }
                               //if(equipoToAdd == null){
                               //    AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                               //    alertDialog.setTitle("Error");
                               //    alertDialog.setMessage("Número de Serie no encontrado en el Almacen: "+almacenOrigen.getText());
                               //    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                               //            new DialogInterface.OnClickListener() {
                               //                public void onClick(DialogInterface dialog, int which) {
                               //                    dialog.dismiss();
                               //                }
                               //            });
                               //    alertDialog.show();
                               //} else {

                                    int valorScanner = 0;
                                    //En el api está como int, hay que cambiarlo a bool en el futuro.
                                    if (checkScanner) {
                                        valorScanner = 1;
                                    } else {
                                        valorScanner = 0;
                                    }
                                    equipoToAdd.setSerie_escaneado(valorScanner);

                                    listEquiposToSend.add(equipoToAdd);
                                    if (listEquiposToSend.size() == 0) {
                                        //Hacer el emptystate acá
                                    } else {
                                        EquiposAdapter equiposAdapter = new EquiposAdapter(mContext, listEquiposToSend);
                                        listViewEquipos.setAdapter(equiposAdapter);
                                        edCode.setText("");
                                    }
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
                                        //Intent intent = new Intent(mContext, UbicarULDetalleActivity.class);
                                        //intent.putExtra("ulRecepcion", new Gson().toJson(ulRecepcion));
                                        //intent.putExtra("scanned1", checkScanner);
                                        //ActivityOptions options =
                                        //        ActivityOptions.makeCustomAnimation(mContext, R.anim.fragment_fade_enter, R.anim.fragment_fade_exit);
                                        //startActivity(intent, options.toBundle());
                                    }

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

                    } catch (Exception e) {
                        e.printStackTrace();
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

        AidcManager.create(mContext, new AidcManager.CreatedCallback() {
            @Override
            public void onCreated(AidcManager aidcManager) {
                manager = aidcManager;
            }
        });


        ImageView scanButton = (ImageView)findViewById(R.id.scanButton);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    edCode.setText("");
                    if(scannerSwitch){
                        tipoScanner = "SCANNER_PANTALLA_PRINCIPAL";
                        scannerSwitch = !scannerSwitch;
                        barcodeReader = manager.createBarcodeReader();
                        barcodeReader.claim();
                        barcodeReader.aim(true);
                        barcodeReader.light(true);
                        barcodeReader.decode(true);
                        barcodeReader.addBarcodeListener(MovimientoEquiposActivity.this);
                    } else {
                        scannerSwitch = !scannerSwitch;
                        barcodeReader.release();
                        barcodeReader.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Intent intent = new Intent(mContext, ScannerActivity.class);
                    startActivityForResult(intent, ScannerActivity.SCANNER_ACTIVITY_RESULT);
                }
            }
        });


        sendEquiposButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listEquiposToSend.size()!=0){
                    JsonArray jsonArray = new JsonArray();
                    JsonObject jsonObject = new JsonObject();
                    for(int i=0; i<listEquiposToSend.size(); i++){
                        jsonObject = new JsonObject();
                        jsonObject.addProperty("SERIE",listEquiposToSend.get(i).getSerie());
                        jsonObject.addProperty("CODIGO_PRODUCTO",listEquiposToSend.get(i).getProducto());
                        jsonObject.addProperty("SERIE_ESCANEADO",listEquiposToSend.get(i).getSerie_escaneado());
                        jsonArray.add(jsonObject);
                    }

                    //Menú popup para escanear la ubicacion
                    enviarEquiposMenuShow(jsonArray);

                }else{


                    AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                    alertDialog.setTitle("Error");
                    alertDialog.setMessage("Debe ingresar al menos 1 equipo");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
            }
        });


    }

    // Este método se llama en el Adapter. Hacer lo mismo para el search, pasarle el equipo
    // y directamente desde el nuevo método abrir el intent a la ventana detalle de equipo
    public static void updateList(int position, List<Equipo> equipos){
        equipos.remove(position);
        listEquiposToSend = equipos;
        EquiposAdapter equiposAdapter = new EquiposAdapter(MovimientoEquiposActivity.mContext,equipos);
        listViewEquipos.setAdapter(equiposAdapter);
    }



    // Este método se llama en el Adapter. Hacer lo mismo para el search, pasarle el equipo
    // y directamente desde el nuevo método abrir el intent a la ventana detalle de equipo
    public static void showInfoEquipo(int position, List<Equipo> equipos){
        Utilidades.showEquipoDetalle(equipos.get(position),mContext);
    }

    @Override
    public void onBarcodeEvent(BarcodeReadEvent barcodeReadEvent) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // TODO pendiente de test en el dispositivo. Validado que con la Cámara funciona.
                if(tipoScanner.equals("SCANNER_ALERT_DIALOG")){
                    codMoveED.setText(barcodeReadEvent.getBarcodeData());
                }
                if(tipoScanner.equals("SCANNER_PANTALLA_PRINCIPAL")){
                    edCode.setText(barcodeReadEvent.getBarcodeData());
                    if(Utilidades.opcionEscaneoRapido.equals("Si")){
                        validarButton.callOnClick();
                    }
                }
                scannerSwitch = true;
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
            if (requestCode == ScannerActivity.SCANNER_ACTIVITY_RESULT_FROM_DIALOG) {
                String barcode = data.getExtras().getString(ScannerActivity.READED_CODE);
                if (barcode != null){
                    codMoveED.setText(barcode.toUpperCase(Locale.getDefault()));
                }
            }
    }

    public void enviarEquiposMenuShow(JsonArray jsonArray){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(mContext);
        View titleView = getLayoutInflater().inflate(R.layout.tittle_scanner_dialog, null);

        dialogBuilder.setCustomTitle(titleView);
        //dialogBuilder.setTitle("¿Dónde moverá los equipos?");
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View dialogView = inflater.inflate(R.layout.layout_scanner_dialog, null);
        dialogBuilder.setView(dialogView);
        codMoveED = (TextView)dialogView.findViewById(R.id.edCode);
        TextView textScanner = (TextView)dialogView.findViewById(R.id.textCodigoScanner);
        RadioGroup radioGroup = (RadioGroup) dialogView.findViewById(R.id.radiogroupUbicacion);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton)dialogView.findViewById(i);
                //Toast.makeText(mContext,radioButton.getText() +"",Toast.LENGTH_SHORT).show();
                if(codMoveED.getHint().equals("Código de la Ubicación")){
                    tipoEnvioCheck = true;
                    codMoveED.setHint("Código de la UL");
                    //textScanner.setText("Escanee el código de la ul");
                }else{
                    tipoEnvioCheck = false;
                    codMoveED.setHint("Código de la Ubicación");
                    //textScanner.setText("Escanee el código de la Ubicación");
                }
            }
        });


        Spinner spinnerUbicacionDestino = (Spinner)dialogView.findViewById(R.id.almacenesSpinnerDestinoDialog);

        ArrayAdapter<Almacen> dataAdapter = new ArrayAdapter<Almacen>(this,
                android.R.layout.simple_spinner_item, Utilidades.almacenes);


        spinnerUbicacionDestino.setAdapter(dataAdapter);

        int posOrigen = 0;
        for(int i=0; i<Utilidades.almacenes.size();i++){
            if (Utilidades.almacenes.get(i).getId().equals(almacenOrigen.getId())){
                posOrigen = i;
            }
        }

        spinnerUbicacionDestino.setSelection(posOrigen);

        ImageView scanButton = (ImageView)dialogView.findViewById(R.id.scanButtonUbicacion);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    codMoveED.setText("");
                    if(scannerSwitch){
                        tipoScanner = "SCANNER_ALERT_DIALOG";
                        scannerSwitch = !scannerSwitch;
                        barcodeReader = manager.createBarcodeReader();
                        barcodeReader.claim();
                        barcodeReader.aim(true);
                        barcodeReader.light(true);
                        barcodeReader.decode(true);
                        barcodeReader.addBarcodeListener(MovimientoEquiposActivity.this);
                    } else {
                        scannerSwitch = !scannerSwitch;
                        barcodeReader.release();
                        barcodeReader.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Intent intent = new Intent(mContext, ScannerActivity.class);
                    startActivityForResult(intent, ScannerActivity.SCANNER_ACTIVITY_RESULT_FROM_DIALOG);
                }
            }
        });

        Button sendButtonDialog = (Button)dialogView.findViewById(R.id.sendEquiposDialogButton);
        Button cancel = (Button)dialogView.findViewById(R.id.cancelarButton);

        sendButtonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ACÁ TENDRÉ QUE HACER 2 LLAMADOS DISTINTOS, SEGÚN EL RADIO BUTTON QUE ESTÉ ACTIVO:
                if(codMoveED.getText().length()!=0) {
                    if (tipoEnvioCheck) { //UL
                        Almacen almacenSelected = new Gson().fromJson(new Gson().toJson(spinnerUbicacionDestino.getSelectedItem()), Almacen.class);
                        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                        Call<String> recepcionCall = service.movimientoEquipos(
                                "2",
                                ulRecepcion.getUl(),
                                almacenOrigen.getCodUbicacion(),
                                ulRecepcion.getCodigo_ubicacion(),
                                almacenSelected.getCodUbicacion(),
                                ulRecepcion.getUbicar_en(),
                                codMoveED.getText()+"",
                                jsonArray.toString());
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

                                Toast.makeText(mContext, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    } else { //UBICACION
                        Almacen almacenSelected = new Gson().fromJson(new Gson().toJson(spinnerUbicacionDestino.getSelectedItem()), Almacen.class);
                        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                        Call<String> recepcionCall = service.movimientoEquipos(
                                "2",
                                ulRecepcion.getUl(),
                                almacenOrigen.getCodUbicacion(),
                                ulRecepcion.getCodigo_ubicacion(),
                                almacenSelected.getCodUbicacion(),
                                ulRecepcion.getUbicar_en(),
                                "",
                                jsonArray.toString());
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

                                Toast.makeText(mContext, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                } else {
                    if(tipoEnvioCheck){
                        AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("Debe ingresar una UL");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                    }else{
                        AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("Debe ingresar una Ubicación");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Aceptar",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                    }
                }
            }
        });

        AlertDialog alertDialog = dialogBuilder.create();

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        alertDialog.show();

        int stopper = 0;

        // ACÁ TENGO QUE DECIDIR SI VOY A HACER UNA NUEVA VENTANA PARA ESCANEAR O INGRESAR MANUALMENTE LA UBICACIÓN
        // O SI LO PUEDO HACER CON UN DIALOGO.


    }
}