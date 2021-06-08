package es.diusframi.orionlogisticsmobile.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_notificaciones")
public class DiusNotificacionesDB {
    @PrimaryKey
    @SerializedName("partes_totales")
    private int partes_totales;

    @SerializedName("partes_nuevos")
    private int partes_nuevos;

    @SerializedName("partes_curso_totales")
    private int partes_curso_totales;

    @SerializedName("partes_curso_nuevos")
    private int partes_curso_nuevos;

    @SerializedName("partes_rechazados_totales")
    private int partes_rechazados_totales;

    @SerializedName("partes_rechazados_nuevos")
    private int partes_rechazados_nuevos;

    @SerializedName("almacen_entradas_totales")
    private int almacen_entradas_totales;

    @SerializedName("almacen_entradas_nuevos")
    private int almacen_entradas_nuevos;

    @SerializedName("almacen_salidas_totales")
    private int almacen_salidas_totales;

    @SerializedName("almacen_salidas_nuevos")
    private int almacen_salidas_nuevos;

    @SerializedName("ruta_totales")
    private int ruta_totales;

    @SerializedName("ruta_nuevos")
    private int ruta_nuevos;

    @SerializedName("mensajes_totales")
    private int mensajes_totales;

    @SerializedName("mensajes_nuevos")
    private int mensajes_nuevos;

    @SerializedName("documentos_totales")
    private int documentos_totales;

    @SerializedName("documentos_nuevos")
    private int documentos_nuevos;

    public DiusNotificacionesDB(int partes_totales, int partes_nuevos, int partes_curso_totales, int partes_curso_nuevos, int partes_rechazados_totales, int partes_rechazados_nuevos, int almacen_entradas_totales, int almacen_entradas_nuevos, int almacen_salidas_totales, int almacen_salidas_nuevos, int ruta_totales, int ruta_nuevos, int mensajes_totales, int mensajes_nuevos, int documentos_totales, int documentos_nuevos) {
        this.partes_totales = partes_totales;
        this.partes_nuevos = partes_nuevos;
        this.partes_curso_totales = partes_curso_totales;
        this.partes_curso_nuevos = partes_curso_nuevos;
        this.partes_rechazados_totales = partes_rechazados_totales;
        this.partes_rechazados_nuevos = partes_rechazados_nuevos;
        this.almacen_entradas_totales = almacen_entradas_totales;
        this.almacen_entradas_nuevos = almacen_entradas_nuevos;
        this.almacen_salidas_totales = almacen_salidas_totales;
        this.almacen_salidas_nuevos = almacen_salidas_nuevos;
        this.ruta_totales = ruta_totales;
        this.ruta_nuevos = ruta_nuevos;
        this.mensajes_totales = mensajes_totales;
        this.mensajes_nuevos = mensajes_nuevos;
        this.documentos_totales = documentos_totales;
        this.documentos_nuevos = documentos_nuevos;
    }

    public int getPartes_totales() {
        return partes_totales;
    }

    public void setPartes_totales(int partes_totales) {
        this.partes_totales = partes_totales;
    }

    public int getPartes_nuevos() {
        return partes_nuevos;
    }

    public void setPartes_nuevos(int partes_nuevos) {
        this.partes_nuevos = partes_nuevos;
    }

    public int getPartes_curso_totales() {
        return partes_curso_totales;
    }

    public void setPartes_curso_totales(int partes_curso_totales) {
        this.partes_curso_totales = partes_curso_totales;
    }

    public int getPartes_curso_nuevos() {
        return partes_curso_nuevos;
    }

    public void setPartes_curso_nuevos(int partes_curso_nuevos) {
        this.partes_curso_nuevos = partes_curso_nuevos;
    }

    public int getPartes_rechazados_totales() {
        return partes_rechazados_totales;
    }

    public void setPartes_rechazados_totales(int partes_rechazados_totales) {
        this.partes_rechazados_totales = partes_rechazados_totales;
    }

    public int getPartes_rechazados_nuevos() {
        return partes_rechazados_nuevos;
    }

    public void setPartes_rechazados_nuevos(int partes_rechazados_nuevos) {
        this.partes_rechazados_nuevos = partes_rechazados_nuevos;
    }

    public int getAlmacen_entradas_totales() {
        return almacen_entradas_totales;
    }

    public void setAlmacen_entradas_totales(int almacen_entradas_totales) {
        this.almacen_entradas_totales = almacen_entradas_totales;
    }

    public int getAlmacen_entradas_nuevos() {
        return almacen_entradas_nuevos;
    }

    public void setAlmacen_entradas_nuevos(int almacen_entradas_nuevos) {
        this.almacen_entradas_nuevos = almacen_entradas_nuevos;
    }

    public int getAlmacen_salidas_totales() {
        return almacen_salidas_totales;
    }

    public void setAlmacen_salidas_totales(int almacen_salidas_totales) {
        this.almacen_salidas_totales = almacen_salidas_totales;
    }

    public int getAlmacen_salidas_nuevos() {
        return almacen_salidas_nuevos;
    }

    public void setAlmacen_salidas_nuevos(int almacen_salidas_nuevos) {
        this.almacen_salidas_nuevos = almacen_salidas_nuevos;
    }

    public int getRuta_totales() {
        return ruta_totales;
    }

    public void setRuta_totales(int ruta_totales) {
        this.ruta_totales = ruta_totales;
    }

    public int getRuta_nuevos() {
        return ruta_nuevos;
    }

    public void setRuta_nuevos(int ruta_nuevos) {
        this.ruta_nuevos = ruta_nuevos;
    }

    public int getMensajes_totales() {
        return mensajes_totales;
    }

    public void setMensajes_totales(int mensajes_totales) {
        this.mensajes_totales = mensajes_totales;
    }

    public int getMensajes_nuevos() {
        return mensajes_nuevos;
    }

    public void setMensajes_nuevos(int mensajes_nuevos) {
        this.mensajes_nuevos = mensajes_nuevos;
    }

    public int getDocumentos_totales() {
        return documentos_totales;
    }

    public void setDocumentos_totales(int documentos_totales) {
        this.documentos_totales = documentos_totales;
    }

    public int getDocumentos_nuevos() {
        return documentos_nuevos;
    }

    public void setDocumentos_nuevos(int documentos_nuevos) {
        this.documentos_nuevos = documentos_nuevos;
    }
}
