package es.diusframi.orionlogisticsmobile.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_mensajes")
public class DiusMensajesDB {

    @PrimaryKey
    @SerializedName("id_mensaje")
    private int id_mensaje;

    @SerializedName("mensaje")
    private String mensaje;

    //Este campo es DATE hay que hacer un typeConverter
    @SerializedName("fecha_mensaje")
    private String fecha_mensaje;

    @SerializedName("tipo")
    private int tipo;

    @SerializedName("nombre")
    private String nombre;

    public DiusMensajesDB(int id_mensaje, String mensaje, String fecha_mensaje, int tipo, String nombre) {
        this.id_mensaje = id_mensaje;
        this.mensaje = mensaje;
        this.fecha_mensaje = fecha_mensaje;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public int getId_mensaje() {
        return id_mensaje;
    }

    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
