package es.diusframi.orionlogisticsmobile.ui.viewsAdapters;

/**
 * Created by RicardoAveledo on 16/11/2020.
 */
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import es.diusframi.orionlogisticsmobile.R;
import es.diusframi.orionlogisticsmobile.models.MainMenuItem;

public class MainMenuAdapter extends BaseAdapter {
    private Context mContext;
    public ArrayList<MainMenuItem> menuItems = new ArrayList<>();
    public int height;

    // Constructor
    public MainMenuAdapter(Context c, ArrayList<MainMenuItem> menuItems, int height){
        this.mContext = c;
        this.menuItems = menuItems;
        this.height = height;
    }


    @Override
    public int getCount() {
        return menuItems.size();
    }

    @Override
    public MainMenuItem getItem(int position) {
        return menuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null)
        {
            gridView = new View(mContext);
            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.main_menu_item, null);

            gridView.setMinimumHeight(3000);
            RelativeLayout mainMenuRL = gridView.findViewById(R.id.relativeLayout_mainMenu);
            mainMenuRL.setMinimumHeight(height/menuItems.size());

            TextView title = gridView.findViewById(R.id.textViewTitle);
            TextView notificationsNumber = gridView.findViewById(R.id.textViewNotificaciones);
            TextView notificationsText = gridView.findViewById(R.id.textViewNotificacionTexto);
            ImageView imageViewItem = gridView.findViewById(R.id.imageViewItem);

            title.setText(menuItems.get(position).getTitle());
            notificationsNumber.setText(menuItems.get(position).getNotificationNumber());
            notificationsText.setText(menuItems.get(position).getNotificationText());
            imageViewItem.setImageDrawable(menuItems.get(position).getDrawable());

            if (menuItems.get(position).getNotificationNumber().equals("0")){
                notificationsNumber.setVisibility(View.INVISIBLE);
            }
            if (menuItems.get(position).getNotificationText().equals("")){
                notificationsText.setVisibility(View.INVISIBLE);
            }
        }
        else
        {
            gridView = (View) convertView;
        }
        return gridView;
    }

}

