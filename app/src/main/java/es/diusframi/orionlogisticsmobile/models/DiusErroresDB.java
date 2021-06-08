package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_errores")
public class DiusErroresDB {

    @PrimaryKey
    @NonNull
    @SerializedName("scoderror")
    private String scoderror; //Tipo nvarchar(4)

    //Tipo nvarchar(100)
    @SerializedName("serror")
    private String serror;

    //Tipo tinyint
    @SerializedName("ifirma")
    private int ifirma;

    //Tipo tinyint
    @SerializedName("ifoto")
    private int ifoto;

    //Tipo tinyint
    @SerializedName("iobs")
    private int iobs;

    //CONSTRAINT "PK__dius_errores__000000000000003F" PRIMARY KEY("scoderror")

    public DiusErroresDB(@NonNull String scoderror, String serror, int ifirma, int ifoto, int iobs) {
        this.scoderror = scoderror;
        this.serror = serror;
        this.ifirma = ifirma;
        this.ifoto = ifoto;
        this.iobs = iobs;
    }

    @NonNull
    public String getScoderror() {
        return scoderror;
    }

    public void setScoderror(@NonNull String scoderror) {
        this.scoderror = scoderror;
    }

    public String getSerror() {
        return serror;
    }

    public void setSerror(String serror) {
        this.serror = serror;
    }

    public int getIfirma() {
        return ifirma;
    }

    public void setIfirma(int ifirma) {
        this.ifirma = ifirma;
    }

    public int getIfoto() {
        return ifoto;
    }

    public void setIfoto(int ifoto) {
        this.ifoto = ifoto;
    }

    public int getIobs() {
        return iobs;
    }

    public void setIobs(int iobs) {
        this.iobs = iobs;
    }
}

