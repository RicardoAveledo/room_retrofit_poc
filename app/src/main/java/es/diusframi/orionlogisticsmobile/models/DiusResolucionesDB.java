package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_resoluciones")
public class DiusResolucionesDB {

    @PrimaryKey
    @NonNull
    @SerializedName("scodres") //Este campo es de tipo nvarchar(4)
    private String scodres;

    //Este campo es de tipo nvarchar(100)
    @SerializedName("sres")
    private String sres;

    //Este campo es de tipo tinyint
    @SerializedName("ifirma")
    private int ifirma;

    //Este campo es de tipo tinyint
    @SerializedName("ifoto")
    private int ifoto;

    //Este campo es de tipo tinyint
    @SerializedName("iobs")
    private int iobs;

    //CONSTRAINT "PK__dius_resoluciones__000000000000014E" PRIMARY KEY("scodres")


    public DiusResolucionesDB(@NonNull String scodres, String sres, int ifirma, int ifoto, int iobs) {
        this.scodres = scodres;
        this.sres = sres;
        this.ifirma = ifirma;
        this.ifoto = ifoto;
        this.iobs = iobs;
    }

    @NonNull
    public String getScodres() {
        return scodres;
    }

    public void setScodres(@NonNull String scodres) {
        this.scodres = scodres;
    }

    public String getSres() {
        return sres;
    }

    public void setSres(String sres) {
        this.sres = sres;
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
