package es.diusframi.orionlogisticsmobile.ui.scanner;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.zxing.Result;

import es.diusframi.orionlogisticsmobile.R;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScannerActivity extends Activity implements ZXingScannerView.ResultHandler {

    // Al llamar el intent, puedes usar estos flags para detectar el resultado, así, si tienes
    // más de un intent que llame a la cámara, podrás filtrar cada intent en el on result.
    public static final int SCANNER_ACTIVITY_RESULT = 3;
    public static final int SCANNER_ACTIVITY_RESULT_FROM_DIALOG = 4;
    public static final String READED_CODE = "READED_CODE";
    private ZXingScannerView mScannerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.azul_oscuro));
        }

        ZXingScannerView camaravista = findViewById(R.id.camera_preview);
        mScannerView = new ZXingScannerView(this);

        if (camaravista != null)
            camaravista.addView(mScannerView);
    }

    @Override
    public void handleResult(Result result) {
        try {
            Intent intent = getIntent();
            intent.putExtra(READED_CODE, result.getText());
            setResult(RESULT_OK, intent);
        } catch (Exception e) {
            setResult(RESULT_CANCELED);
        }

        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mScannerView.stopCamera();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }
}
