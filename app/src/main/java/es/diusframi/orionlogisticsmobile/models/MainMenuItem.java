package es.diusframi.orionlogisticsmobile.models;

import android.graphics.drawable.Drawable;

/**
 * Created by RicardoAveledo on 16/11/2020.
 */
public class MainMenuItem {
    public String title;
    public String notificationNumber;
    public String notificationText;
    public Drawable drawable;

    public MainMenuItem(String title, String notificationNumber, String notificationText, Drawable drawable) {
        this.title = title;
        this.notificationNumber = notificationNumber;
        this.notificationText = notificationText;
        this.drawable = drawable;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public void setNotificationText(String notificationText) {
        this.notificationText = notificationText;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotificationNumber() {
        return notificationNumber;
    }

    public void setNotificationNumber(String notificationNumber) {
        notificationNumber = notificationNumber;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }
}
