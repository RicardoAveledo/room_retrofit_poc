package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_fotosparte")
public class DiusFotosparteDB {

    @PrimaryKey
    @NonNull
    @SerializedName("idimage")
    private String idimage; //Tipo nchar (32)

    //Tipo nvarchar(11)
    @SerializedName("fidparte")
    private String fidparte;

    @SerializedName("iestado")
    private int iestado;

    //Tipo nvarchar(300)
    @SerializedName("sfile")
    private String sfile;

    //Tipo nvarchar(40)
    @SerializedName("lat")
    private String lat;

    //Tipo nvarchar(40)
    @SerializedName("lon")
    private String lon;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("ddate")
    private String ddate;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("dimage")
    private String dimage;

    @SerializedName("codigo_cierre")
    private String codigo_cierre;

    @SerializedName("categoria")
    private String categoria;

    @SerializedName("titulo")
    private String titulo;

    @SerializedName("tipo")
    private String tipo;

    //CONSTRAINT "PK__dius_fotosparte__0000000000000055" PRIMARY KEY("idimage")


    public DiusFotosparteDB(@NonNull String idimage, String fidparte, int iestado, String sfile, String lat, String lon, String ddate, String dimage, String codigo_cierre, String categoria, String titulo, String tipo) {
        this.idimage = idimage;
        this.fidparte = fidparte;
        this.iestado = iestado;
        this.sfile = sfile;
        this.lat = lat;
        this.lon = lon;
        this.ddate = ddate;
        this.dimage = dimage;
        this.codigo_cierre = codigo_cierre;
        this.categoria = categoria;
        this.titulo = titulo;
        this.tipo = tipo;
    }

    @NonNull
    public String getIdimage() {
        return idimage;
    }

    public void setIdimage(@NonNull String idimage) {
        this.idimage = idimage;
    }

    public String getFidparte() {
        return fidparte;
    }

    public void setFidparte(String fidparte) {
        this.fidparte = fidparte;
    }

    public int getIestado() {
        return iestado;
    }

    public void setIestado(int iestado) {
        this.iestado = iestado;
    }

    public String getSfile() {
        return sfile;
    }

    public void setSfile(String sfile) {
        this.sfile = sfile;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getDimage() {
        return dimage;
    }

    public void setDimage(String dimage) {
        this.dimage = dimage;
    }

    public String getCodigo_cierre() {
        return codigo_cierre;
    }

    public void setCodigo_cierre(String codigo_cierre) {
        this.codigo_cierre = codigo_cierre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

