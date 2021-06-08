package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_datosllamadaparte")
public class DiusDatosllamadaparteDB {

    @PrimaryKey
    @SerializedName("iddatosllamadaparte")
    private int iddatosllamadaparte;

    @SerializedName("idparte")
    private int idparte;

    @SerializedName("sllamada_usuario")
    private String sllamada_usuario;

    // Este campo es DATE hay que hacer un typeConverter
    @SerializedName("dllamada_fecha")
    private String dllamada_fecha;

    @SerializedName("sllamada_contacto")
    private String sllamada_contacto;

    @SerializedName("sllamada_filtro")
    private String sllamada_filtro;

    @SerializedName("sllamada_observaciones")
    private String sllamada_observaciones;

    @SerializedName("sllamada_telefono")
    private String sllamada_telefono;

    @SerializedName("sllamada_cita")
    private String sllamada_cita;

    public DiusDatosllamadaparteDB(int iddatosllamadaparte, int idparte, String sllamada_usuario, String dllamada_fecha, String sllamada_contacto, String sllamada_filtro, String sllamada_observaciones, String sllamada_telefono, String sllamada_cita) {
        this.iddatosllamadaparte = iddatosllamadaparte;
        this.idparte = idparte;
        this.sllamada_usuario = sllamada_usuario;
        this.dllamada_fecha = dllamada_fecha;
        this.sllamada_contacto = sllamada_contacto;
        this.sllamada_filtro = sllamada_filtro;
        this.sllamada_observaciones = sllamada_observaciones;
        this.sllamada_telefono = sllamada_telefono;
        this.sllamada_cita = sllamada_cita;
    }

    public int getIddatosllamadaparte() {
        return iddatosllamadaparte;
    }

    public void setIddatosllamadaparte(int iddatosllamadaparte) {
        this.iddatosllamadaparte = iddatosllamadaparte;
    }

    public int getIdparte() {
        return idparte;
    }

    public void setIdparte(int idparte) {
        this.idparte = idparte;
    }

    public String getSllamada_usuario() {
        return sllamada_usuario;
    }

    public void setSllamada_usuario(String sllamada_usuario) {
        this.sllamada_usuario = sllamada_usuario;
    }

    public String getDllamada_fecha() {
        return dllamada_fecha;
    }

    public void setDllamada_fecha(String dllamada_fecha) {
        this.dllamada_fecha = dllamada_fecha;
    }

    public String getSllamada_contacto() {
        return sllamada_contacto;
    }

    public void setSllamada_contacto(String sllamada_contacto) {
        this.sllamada_contacto = sllamada_contacto;
    }

    public String getSllamada_filtro() {
        return sllamada_filtro;
    }

    public void setSllamada_filtro(String sllamada_filtro) {
        this.sllamada_filtro = sllamada_filtro;
    }

    public String getSllamada_observaciones() {
        return sllamada_observaciones;
    }

    public void setSllamada_observaciones(String sllamada_observaciones) {
        this.sllamada_observaciones = sllamada_observaciones;
    }

    public String getSllamada_telefono() {
        return sllamada_telefono;
    }

    public void setSllamada_telefono(String sllamada_telefono) {
        this.sllamada_telefono = sllamada_telefono;
    }

    public String getSllamada_cita() {
        return sllamada_cita;
    }

    public void setSllamada_cita(String sllamada_cita) {
        this.sllamada_cita = sllamada_cita;
    }
}
