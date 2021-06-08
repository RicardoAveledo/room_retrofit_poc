package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_lastupdates")
public class DiusLastupdatesDB {

    @PrimaryKey
    @NonNull
    @SerializedName("title") //Tipo nvarchar(250)
    private String title;

    //Tipo nvarchar(50)
    @SerializedName("lastupdate")
    private String lastupdate;

    public DiusLastupdatesDB(@NonNull String title, String lastupdate) {
        this.title = title;
        this.lastupdate = lastupdate;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }
}