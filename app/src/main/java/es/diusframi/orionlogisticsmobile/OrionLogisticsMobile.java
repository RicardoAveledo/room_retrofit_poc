package es.diusframi.orionlogisticsmobile;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;


/**
 * Created by RicardoAveledo on 01/10/2020.
 */
public class OrionLogisticsMobile extends Application {

    protected static RequestQueue queue;

    @Override
    public void onCreate() {
        super.onCreate();
        // Código para evitar que se produzca un error al abrir la cámara o la galería de fotos
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

    }

    public static RequestQueue getVolleyQueue(Context context) {
        if (queue == null)
            queue = Volley.newRequestQueue(context);

        return queue;
    }
}
