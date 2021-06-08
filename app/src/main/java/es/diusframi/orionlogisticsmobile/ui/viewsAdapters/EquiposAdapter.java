package es.diusframi.orionlogisticsmobile.ui.viewsAdapters;

/**
 * Created by RicardoAveledo on 16/11/2020.
 */
        import android.content.Context;
        import android.media.audiofx.DynamicsProcessing;
        import android.util.DisplayMetrics;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.Button;
        import android.widget.GridView;
        import android.widget.ImageView;
        import android.widget.RelativeLayout;
        import android.widget.TextView;

        import org.w3c.dom.Text;

        import java.util.ArrayList;
        import java.util.List;

        import es.diusframi.orionlogisticsmobile.R;
        import es.diusframi.orionlogisticsmobile.models.Equipo;
        import es.diusframi.orionlogisticsmobile.models.MainMenuItem;
        import es.diusframi.orionlogisticsmobile.ui.movimientoUL.MovimientoEquiposActivity;

/**
 * Created by RicardoAveledo on 02/02/2021.
 */
public class EquiposAdapter extends BaseAdapter {
    private Context mContext;
    public List<Equipo> equipos = new ArrayList<>();
    public int height;

    // Constructor
    public EquiposAdapter(Context c, List<Equipo> equipos){
        this.mContext = c;
        this.equipos = equipos;
    }


    @Override
    public int getCount() {
        return equipos.size();
    }

    @Override
    public Equipo getItem(int position) {
        return equipos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ListView;
        if (convertView == null)
        {
            ListView = new View(mContext);
            // get layout from mobile.xml
            ListView = inflater.inflate(R.layout.equipo_item, null);

            TextView nombreEquipo = ListView.findViewById(R.id.equipoName);
            TextView serieEquipo = ListView.findViewById(R.id.equipoSerie);

            Button delete = ListView.findViewById(R.id.buttonDelete);

            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MovimientoEquiposActivity.updateList(position,equipos);
                }
            });


            Button showInfoEquipo = ListView.findViewById(R.id.buttonSearch);

            showInfoEquipo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MovimientoEquiposActivity.showInfoEquipo(position,equipos);
                }
            });

            nombreEquipo.setText(equipos.get(position).getDescripcion());
            serieEquipo.setText(equipos.get(position).getSerie());


        }
        else
        {
            ListView = (View) convertView;
        }
        return ListView;
    }

}


