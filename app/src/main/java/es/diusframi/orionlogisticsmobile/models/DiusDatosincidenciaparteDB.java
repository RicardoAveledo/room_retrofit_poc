package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_datosincidenciaparte")
public class DiusDatosincidenciaparteDB {

    @PrimaryKey
    @SerializedName("iddatosincidenciaparte")
    private int iddatosincidenciaparte;

    @SerializedName("idparte")
    private int idparte;

    // Este campo es DATE hay que hacer un typeConverter
    @SerializedName("dincidencia_fecha")
    private String dincidencia_fecha;

    @SerializedName("sincidencia_telefono")
    private String sincidencia_telefono;

    @SerializedName("sincidencia_observaciones")
    private String sincidencia_observaciones;

    @SerializedName("sincidencia_des_codigo_error")
    private String sincidencia_des_codigo_error;

    public DiusDatosincidenciaparteDB(int iddatosincidenciaparte, int idparte, String dincidencia_fecha, String sincidencia_telefono, String sincidencia_observaciones, String sincidencia_des_codigo_error) {
        this.iddatosincidenciaparte = iddatosincidenciaparte;
        this.idparte = idparte;
        this.dincidencia_fecha = dincidencia_fecha;
        this.sincidencia_telefono = sincidencia_telefono;
        this.sincidencia_observaciones = sincidencia_observaciones;
        this.sincidencia_des_codigo_error = sincidencia_des_codigo_error;
    }

    public int getIddatosincidenciaparte() {
        return iddatosincidenciaparte;
    }

    public void setIddatosincidenciaparte(int iddatosincidenciaparte) {
        this.iddatosincidenciaparte = iddatosincidenciaparte;
    }

    public int getIdparte() {
        return idparte;
    }

    public void setIdparte(int idparte) {
        this.idparte = idparte;
    }

    public String getDincidencia_fecha() {
        return dincidencia_fecha;
    }

    public void setDincidencia_fecha(String dincidencia_fecha) {
        this.dincidencia_fecha = dincidencia_fecha;
    }

    public String getSincidencia_telefono() {
        return sincidencia_telefono;
    }

    public void setSincidencia_telefono(String sincidencia_telefono) {
        this.sincidencia_telefono = sincidencia_telefono;
    }

    public String getSincidencia_observaciones() {
        return sincidencia_observaciones;
    }

    public void setSincidencia_observaciones(String sincidencia_observaciones) {
        this.sincidencia_observaciones = sincidencia_observaciones;
    }

    public String getSincidencia_des_codigo_error() {
        return sincidencia_des_codigo_error;
    }

    public void setSincidencia_des_codigo_error(String sincidencia_des_codigo_error) {
        this.sincidencia_des_codigo_error = sincidencia_des_codigo_error;
    }
}
