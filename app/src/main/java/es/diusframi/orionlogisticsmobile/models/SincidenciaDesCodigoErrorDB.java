package es.diusframi.orionlogisticsmobile.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "sincidencia_des_codigo_error")
public class SincidenciaDesCodigoErrorDB {

    //PRIMARY KEY("id_fichero")
    @PrimaryKey
    @SerializedName("id_fichero")
    private int id_fichero;

    @SerializedName("nombre_fichero")
    private String nombre_fichero;

    @SerializedName("nombre_etiqueta")
    private String nombre_etiqueta;

    @SerializedName("url_descarga")
    private String url_descarga;

    //Este campo es DATE hay que hacer un typeConverter
    @SerializedName("fecha_subida")
    private String fecha_subida;

    public SincidenciaDesCodigoErrorDB(int id_fichero, String nombre_fichero, String nombre_etiqueta, String url_descarga, String fecha_subida) {
        this.id_fichero = id_fichero;
        this.nombre_fichero = nombre_fichero;
        this.nombre_etiqueta = nombre_etiqueta;
        this.url_descarga = url_descarga;
        this.fecha_subida = fecha_subida;
    }

    public int getId_fichero() {
        return id_fichero;
    }

    public void setId_fichero(int id_fichero) {
        this.id_fichero = id_fichero;
    }

    public String getNombre_fichero() {
        return nombre_fichero;
    }

    public void setNombre_fichero(String nombre_fichero) {
        this.nombre_fichero = nombre_fichero;
    }

    public String getNombre_etiqueta() {
        return nombre_etiqueta;
    }

    public void setNombre_etiqueta(String nombre_etiqueta) {
        this.nombre_etiqueta = nombre_etiqueta;
    }

    public String getUrl_descarga() {
        return url_descarga;
    }

    public void setUrl_descarga(String url_descarga) {
        this.url_descarga = url_descarga;
    }

    public String getFecha_subida() {
        return fecha_subida;
    }

    public void setFecha_subida(String fecha_subida) {
        this.fecha_subida = fecha_subida;
    }
}
