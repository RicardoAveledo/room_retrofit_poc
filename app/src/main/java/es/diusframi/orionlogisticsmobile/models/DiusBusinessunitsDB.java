package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_businessunits")
public class DiusBusinessunitsDB {

    @PrimaryKey
    @SerializedName("idbusinessunit")
    private int idbusinessunit;

    //Este campo es NVARCHAR(50)
    @SerializedName("description")
    private String description;

    //Este campo es NVARCHAR(250)
    @SerializedName("url")
    private String url;

    public DiusBusinessunitsDB(int idbusinessunit, String description, String url) {
        this.idbusinessunit = idbusinessunit;
        this.description = description;
        this.url = url;
    }

    public int getIdbusinessunit() {
        return idbusinessunit;
    }

    public void setIdbusinessunit(int idbusinessunit) {
        this.idbusinessunit = idbusinessunit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
