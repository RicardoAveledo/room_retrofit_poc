package es.diusframi.orionlogisticsmobile.ui.utilitiesViews;

        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.content.ContextCompat;

        import android.app.Activity;
        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.text.Editable;
        import android.text.TextWatcher;
        import android.view.View;
        import android.view.WindowManager;
        import android.widget.AdapterView;
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

public class ConfigurationActivity extends AppCompatActivity{

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

    // True si el código del UL se escaneó. False si se escribió manual
    public Boolean checkScanner = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        setTitle("Configuración");
        mContext = this;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Spinner escaneoRapido = (Spinner)findViewById(R.id.escaneorapidoSpinner);
        Spinner dispositivoScan = (Spinner)findViewById(R.id.dispositivoEscaneoSpinner);

        ArrayAdapter<String> dataAdapterEscaneo = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Utilidades.opcionesEscaneoRapido);
        escaneoRapido.setAdapter(dataAdapterEscaneo);

        ArrayAdapter<String> dataAdapterDispositivo = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Utilidades.opcionesDispositivoEscaneo);
        dispositivoScan.setAdapter(dataAdapterDispositivo);

        SharedPreferences sharedPref = this.getSharedPreferences("OLM",0);
        String opcionEscaneoRapido = sharedPref.getString("escaneoRapido", "");
        String opcionDispositivoEscaneo = sharedPref.getString("dispositivoEscaneo", "");

        if(opcionEscaneoRapido.equals("Si")){
            escaneoRapido.setSelection(0);
        } else {
            escaneoRapido.setSelection(1);
        }

        if(opcionDispositivoEscaneo.equals("Cámara")){
            dispositivoScan.setSelection(0);
        } else {
            dispositivoScan.setSelection(1);
        }

        escaneoRapido.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = "";
                if(i == 0){
                    selection = "Si";
                } else {
                    selection = "No";
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("escaneoRapido", selection);
                editor.commit();
                Utilidades.opcionEscaneoRapido = selection;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        dispositivoScan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = "";
                if(i == 0){
                    selection = "Cámara";
                } else {
                    selection = "Escáner";
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("dispositivoEscaneo", selection);
                editor.commit();
                Utilidades.opcionDispositivoEscaneo = selection;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @Override
    protected void onResume() {
        //edCode.setText("");
        super.onResume();
        Spinner escaneoRapido = (Spinner)findViewById(R.id.escaneorapidoSpinner);
        Spinner dispositivoScan = (Spinner)findViewById(R.id.dispositivoEscaneoSpinner);

        ArrayAdapter<String> dataAdapterEscaneo = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Utilidades.opcionesEscaneoRapido);
        escaneoRapido.setAdapter(dataAdapterEscaneo);

        ArrayAdapter<String> dataAdapterDispositivo = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Utilidades.opcionesDispositivoEscaneo);
        dispositivoScan.setAdapter(dataAdapterDispositivo);

        SharedPreferences sharedPref = this.getSharedPreferences("OLM",0);
        String opcionEscaneoRapido = sharedPref.getString("escaneoRapido", "");
        String opcionDispositivoEscaneo = sharedPref.getString("dispositivoEscaneo", "");

        if(opcionEscaneoRapido.equals("Si")){
            escaneoRapido.setSelection(0);
        } else {
            escaneoRapido.setSelection(1);
        }

        if(opcionDispositivoEscaneo.equals("Cámara")){
            dispositivoScan.setSelection(0);
        } else {
            dispositivoScan.setSelection(1);
        }

        escaneoRapido.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = "";
                if(i == 0){
                    selection = "Si";
                } else {
                    selection = "No";
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("escaneoRapido", selection);
                editor.commit();
                Utilidades.opcionEscaneoRapido = selection;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        dispositivoScan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selection = "";
                if(i == 0){
                    selection = "Cámara";
                } else {
                    selection = "Escáner";
                }
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString("dispositivoEscaneo", selection);
                editor.commit();
                Utilidades.opcionDispositivoEscaneo = selection;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}