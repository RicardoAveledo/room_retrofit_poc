package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_materiales_v2")
public class DiusMaterialesV2DB {

    //PRIMARY KEY("idmaterial","fidparte","itipo")

    @NonNull
    @PrimaryKey
    @SerializedName("idmaterial")
    private String idmaterial;

    @SerializedName("fidparte")
    private String fidparte;

    @SerializedName("itipo")
    private int itipo;

    @SerializedName("idcommunication")
    private int idcommunication;

    @SerializedName("idmodel")
    private int idmodel;

    @SerializedName("smodelo")
    private String smodelo;

    @SerializedName("scliente")
    private String scliente;

    @SerializedName("cantidad") //-----------DEFAULT 1 ------------
    private int cantidad;

    @SerializedName("categoria")
    private String categoria;

    @SerializedName("modelo_equipo_asociado")
    private String modelo_equipo_asociado;

    @SerializedName("serie_equipo_asociado")
    private String serie_equipo_asociado;

    public DiusMaterialesV2DB(@NonNull String idmaterial, String fidparte, int itipo, int idcommunication, int idmodel, String smodelo, String scliente, int cantidad, String categoria, String modelo_equipo_asociado, String serie_equipo_asociado) {
        this.idmaterial = idmaterial;
        this.fidparte = fidparte;
        this.itipo = itipo;
        this.idcommunication = idcommunication;
        this.idmodel = idmodel;
        this.smodelo = smodelo;
        this.scliente = scliente;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.modelo_equipo_asociado = modelo_equipo_asociado;
        this.serie_equipo_asociado = serie_equipo_asociado;
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

    public String getSmodelo() {
        return smodelo;
    }

    public void setSmodelo(String smodelo) {
        this.smodelo = smodelo;
    }

    public String getScliente() {
        return scliente;
    }

    public void setScliente(String scliente) {
        this.scliente = scliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getModelo_equipo_asociado() {
        return modelo_equipo_asociado;
    }

    public void setModelo_equipo_asociado(String modelo_equipo_asociado) {
        this.modelo_equipo_asociado = modelo_equipo_asociado;
    }

    public String getSerie_equipo_asociado() {
        return serie_equipo_asociado;
    }

    public void setSerie_equipo_asociado(String serie_equipo_asociado) {
        this.serie_equipo_asociado = serie_equipo_asociado;
    }
}
