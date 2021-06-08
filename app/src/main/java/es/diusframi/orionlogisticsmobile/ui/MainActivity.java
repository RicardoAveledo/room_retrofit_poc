package es.diusframi.orionlogisticsmobile.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

import es.diusframi.orionlogisticsmobile.R;
import es.diusframi.orionlogisticsmobile.models.MainMenuItem;
import es.diusframi.orionlogisticsmobile.ui.movimientoUL.MovimientoULActivity;
import es.diusframi.orionlogisticsmobile.ui.ubicarUL.UbicarULActivity;
import es.diusframi.orionlogisticsmobile.ui.utilitiesViews.ConfigurationActivity;
import es.diusframi.orionlogisticsmobile.ui.utilitiesViews.DetalleEquiposActivity;
import es.diusframi.orionlogisticsmobile.ui.viewsAdapters.MainMenuAdapter;
import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;


/**
 * Created by RicardoAveledo on 01/10/2020.
 */
public class MainActivity extends AppCompatActivity {

    Context mContext;
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(0, 0, 0, "Configuración")
        .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent(mContext, ConfigurationActivity.class);
                startActivity(intent);
                return false;
            }
        });
        menu.add(0, 0, 0, "Cerrar sesión")
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        finish();
                        return false;
                    }
                });
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        SharedPreferences sharedPref = this.getSharedPreferences("OLM",0);

        Utilidades.opcionEscaneoRapido = sharedPref.getString("escaneoRapido", "");
        Utilidades.opcionDispositivoEscaneo  = sharedPref.getString("dispositivoEscaneo", "");

        if(Utilidades.opcionesEscaneoRapido.size()==0){
            Utilidades.opcionesEscaneoRapido.add("Si");
            Utilidades.opcionesEscaneoRapido.add("No");
        }

        if(Utilidades.opcionesDispositivoEscaneo.size()==0){
            Utilidades.opcionesDispositivoEscaneo.add("Cámara");
            Utilidades.opcionesDispositivoEscaneo.add("Escáner");
        }

        if(Utilidades.opcionEscaneoRapido.equals("")){
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("escaneoRapido", "No");
            editor.commit();
            Utilidades.opcionEscaneoRapido = "No";
        }

        if(Utilidades.opcionDispositivoEscaneo.equals("")){
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putString("dispositivoEscaneo", "Escáner");
            editor.commit();
            Utilidades.opcionDispositivoEscaneo = "Escáner";
        }


        GridView gridViewMenu = (GridView)findViewById(R.id.gridViewMenu);
        LinearLayout layoutMainMenu = (LinearLayout) findViewById(R.id.layoutMainMenu);

        ArrayList<MainMenuItem> menuItems = new ArrayList<>();
        MainMenuItem ulOpcion1 = new MainMenuItem("UBICAR UL TRAS RECEPCION","3","Nuevas UL a ubicar", ContextCompat.getDrawable(this, R.drawable.ic_menu_almacen_entradas));
        menuItems.add(ulOpcion1);
        MainMenuItem ulOpcion2 = new MainMenuItem("MOVIMIENTO CONTENIDO DE UL","5","Nuevos movimientos", ContextCompat.getDrawable(this, R.drawable.ic_menu_almacen_salidas));
        menuItems.add(ulOpcion2);
        MainMenuItem ulOpcion3 = new MainMenuItem("DETALLE DE EQUIPO","0","", ContextCompat.getDrawable(this, R.drawable.navicon_recibidos));
        menuItems.add(ulOpcion3);
        gridViewMenu.post(new Runnable(){
            public void run(){
                int height = gridViewMenu.getHeight() - (menuItems.size()*10) -20;
                MainMenuAdapter mainMenuAdapter = new MainMenuAdapter(mContext, menuItems, height);
                gridViewMenu.setAdapter(mainMenuAdapter);
                gridViewMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        switch (menuItems.get(i).getTitle()) {
                            case ("UBICAR UL TRAS RECEPCION"): {
                                Intent intent = new Intent(mContext, UbicarULActivity.class);
                                startActivity(intent);
                                break;
                            }
                            case ("MOVIMIENTO CONTENIDO DE UL"): {
                                Intent intent = new Intent(mContext, MovimientoULActivity.class);
                                startActivity(intent);
                                break;
                            }
                            case ("DETALLE DE EQUIPO"): {
                                Intent intent = new Intent(mContext, DetalleEquiposActivity.class);
                                startActivity(intent);
                                break;
                            }
                        }
                    }
                });
            }
        });

    }
}