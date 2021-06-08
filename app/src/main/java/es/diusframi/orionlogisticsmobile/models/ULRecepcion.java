package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;


/**
 * Created by RicardoAveledo on 23/11/2020.
 */
@Entity(tableName = "ulrecepcion")
public class ULRecepcion {

    @PrimaryKey
    @NonNull
    @SerializedName("ul")
    private String ul;
    @SerializedName("descripcion")
    private String descripcion;
    @SerializedName("codigo_almacen")
    private String codigo_almacen;
    @SerializedName("nombre_almacen")
    private String nombre_almacen;
    @SerializedName("completa")
    private boolean completa;
    @SerializedName("ubicar_en")
    private String ubicar_en;
    @SerializedName("nombre_ubicar_en")
    private String nombre_ubicar_en;
    @SerializedName("codigo_ubicacion")
    private String codigo_ubicacion;
    @SerializedName("escaneado")
    private int escaneado;

    public ULRecepcion(@NonNull String ul, String descripcion, String codigo_almacen, String nombre_almacen, boolean completa, String ubicar_en, String nombre_ubicar_en, String codigo_ubicacion, int escaneado) {
        this.ul = ul;
        this.descripcion = descripcion;
        this.codigo_almacen = codigo_almacen;
        this.nombre_almacen = nombre_almacen;
        this.completa = completa;
        this.ubicar_en = ubicar_en;
        this.nombre_ubicar_en = nombre_ubicar_en;
        this.codigo_ubicacion = codigo_ubicacion;
        this.escaneado = escaneado;
    }

    public String getCodigo_ubicacion() {
        return codigo_ubicacion;
    }

    public void setCodigo_ubicacion(String codigo_ubicacion) {
        this.codigo_ubicacion = codigo_ubicacion;
    }

    public int isEscaneado() {
        return escaneado;
    }

    public void setEscaneado(int escaneado) {
        this.escaneado = escaneado;
    }

    @NonNull
    public String getUl() {
        return ul;
    }

    public void setUl(@NonNull String ul) {
        this.ul = ul;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo_almacen() {
        return codigo_almacen;
    }

    public void setCodigo_almacen(String codigo_almacen) {
        this.codigo_almacen = codigo_almacen;
    }

    public String getNombre_almacen() {
        return nombre_almacen;
    }

    public void setNombre_almacen(String nombre_almacen) {
        this.nombre_almacen = nombre_almacen;
    }

    public boolean getCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public String getUbicar_en() {
        return ubicar_en;
    }

    public void setUbicar_en(String ubicar_en) {
        this.ubicar_en = ubicar_en;
    }

    public String getNombre_ubicar_en() {
        return nombre_ubicar_en;
    }

    public void setNombre_ubicar_en(String nombre_ubicar_en) {
        this.nombre_ubicar_en = nombre_ubicar_en;
    }
}
