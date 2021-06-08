package es.diusframi.orionlogisticsmobile.ui;
import android.Manifest;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import es.diusframi.orionlogisticsmobile.R;


/**
 * Created by RicardoAveledo on 01/10/2020.
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        View ivLogo = findViewById(R.id.ivLogo);
        ivLogo.setAlpha(0f);

        ivLogo.animate()
                .alpha(1f)
                .setDuration(1000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        // Do nothing
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        checkPreferences();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {
                        // Do nothing
                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {
                        // Do nothing
                    }
                });
    }

    public void checkPreferences() {
        checkForPermissions();
    }

    public void checkForPermissions() {
        ArrayList<String> requiredPermissions = getRequiredPermissions(this, permisosNecesarios);
        if (askForPermissions() && requiredPermissions.size() > 0) {
            findViewById(R.id.tvAskingPermissions).setVisibility(View.VISIBLE);
            String[] arrayPermissions = new String[requiredPermissions.size()];
            arrayPermissions = requiredPermissions.toArray(arrayPermissions);
            ActivityCompat.requestPermissions(this, arrayPermissions, PERMISSION_ALL);
        } else {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
        }
    }

    public static boolean askForPermissions() {
        return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1);
    }

    public static final String[] permisosNecesarios = new String[]{
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.CAMERA,
            Manifest.permission.READ_CALENDAR,
            Manifest.permission.WRITE_CALENDAR,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.CALL_PHONE
    };


    public static final int PERMISSION_ALL = 1;

    public static ArrayList<String> getRequiredPermissions(Context context, String... permissions) {
        ArrayList<String> requiredPermissions = new ArrayList<>();
        if (context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    requiredPermissions.add(permission);
                }
            }
        }
        return requiredPermissions;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case PERMISSION_ALL: {
                if (grantResults.length <= 0 || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    showSnackbarSettings(findViewById(android.R.id.content), this);
                } else {
                    startActivity(new Intent(this, LoginActivity.class));
                    finish();
                }
            }
        }
    }

    public static void showAppSettings(Context context) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", context.getPackageName(), null);
        intent.setData(uri);
        context.startActivity(intent);
    }

    public static void showSnackbarSettings(View view, final Context context) {
        Snackbar.make(view, R.string.request_permission, Snackbar.LENGTH_INDEFINITE).setAction(R.string.settings, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAppSettings(context);
            }
        }).show();
    }

}
