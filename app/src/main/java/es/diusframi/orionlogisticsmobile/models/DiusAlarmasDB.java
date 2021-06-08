package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;


/**
 * Created by RicardoAveledo on 01/06/2021.
 */
@Entity(tableName = "dius_alarmas")
public class DiusAlarmasDB {

    //Todo lo que no sea INTEGER o TEXT, ponlo como int o String dependiendo de lo que sea
    //y me pones el comentario arriba de la variable para saber qué tipo de dato es originalmente.

    @PrimaryKey
    @SerializedName("id_parte")
    private int id_parte;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("descripcion")
    private String descripcion;

    // Este campo es DATE hay que hacer un typeConverter
    @SerializedName("tiempo")
    private String tiempo;

    // Este campo es DATE hay que hacer un typeConverter
    @SerializedName("fecha_parte")
    private String fecha_parte;

    public DiusAlarmasDB(int id_parte, String codigo, String descripcion, String tiempo, String fecha_parte) {
        this.id_parte = id_parte;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.fecha_parte = fecha_parte;
    }

    public int getId_parte() {
        return id_parte;
    }

    public void setId_parte(int id_parte) {
        this.id_parte = id_parte;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getFecha_parte() {
        return fecha_parte;
    }

    public void setFecha_parte(String fecha_parte) {
        this.fecha_parte = fecha_parte;
    }
}
