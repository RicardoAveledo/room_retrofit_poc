package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_materiales")
public class DiusMaterialesDB {


    @NonNull
    @PrimaryKey
    @SerializedName("idmaterial") //Tipo nvarchar (100)
    private String idmaterial;

    //Tipo nvarchar(22)
    @SerializedName("fidparte")
    private String fidparte;

    //Tipo tinyint
    @SerializedName("itipo")
    private int itipo;

    @SerializedName("idcommunication")
    private int idcommunication;

    @SerializedName("idmodel")
    private int idmodel;

    @SerializedName("scliente")
    private String scliente;

    @SerializedName("smodelo")
    private String smodelo;

    //CONSTRAINT "PK__dius_materiales__0000000000000079" PRIMARY KEY("idmaterial")

    public DiusMaterialesDB(@NonNull String idmaterial, String fidparte, int itipo, int idcommunication, int idmodel, String scliente, String smodelo) {
        this.idmaterial = idmaterial;
        this.fidparte = fidparte;
        this.itipo = itipo;
        this.idcommunication = idcommunication;
        this.idmodel = idmodel;
        this.scliente = scliente;
        this.smodelo = smodelo;
    }

    @NonNull
    public String getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(@NonNull String idmaterial) {
        this.idmaterial = idmaterial;
    }

    public String getFidparte() {
        return fidparte;
    }

    public void setFidparte(String fidparte) {
        this.fidparte = fidparte;
    }

    public int getItipo() {
        return itipo;
    }

    public void setItipo(int itipo) {
        this.itipo = itipo;
    }

    public int getIdcommunication() {
        return idcommunication;
    }

    public void setIdcommunication(int idcommunication) {
        this.idcommunication = idcommunication;
    }

    public int getIdmodel() {
        return idmodel;
    }

    public void setIdmodel(int idmodel) {
        this.idmodel = idmodel;
    }

    public String getScliente() {
        return scliente;
    }

    public void setScliente(String scliente) {
        this.scliente = scliente;
    }

    public String getSmodelo() {
        return smodelo;
    }

    public void setSmodelo(String smodelo) {
        this.smodelo = smodelo;
    }
}
