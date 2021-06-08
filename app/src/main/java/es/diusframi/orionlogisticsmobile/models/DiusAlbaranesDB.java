package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;



@Entity(tableName = "dius_albaranes")
public class DiusAlbaranesDB {

    //Tipo NVARCHAR(20)
    @PrimaryKey
    @NonNull
    @SerializedName("idalbaran")
    private String idalbaran;

    //Tipo NVARCHAR(100)
    @SerializedName("salmacen")
    private String salmacen;

    //Tipo NVARCHAR(20)
    @SerializedName("sfecha")
    private String sfecha;

    //Tipo NVARCHAR(50)
    @SerializedName("scliente")
    private String scliente;

    //Tipo NVARCHAR(20)
    @SerializedName("scod_modelo")
    private String scod_modelo;

    //Tipo NVARCHAR(50)
    @SerializedName("smodelo")
    private String smodelo;

    //Tipo NVARCHAR(50)
    @SerializedName("stipo_stock")
    private String stipo_stock;

    //Tipo NVARCHAR(50)
    @SerializedName("sestado")
    private String sestado;

    //Tipo NVARCHAR(50)
    @SerializedName("snum_serie")
    private String snum_serie;

    //Tipo TINYINT
    @SerializedName("itipo")
    private int itipo;

    //Tipo TINYINT
    @SerializedName("iestadoenvio")
    private int iestadoenvio;

    //Tipo NVARCHAR(50)
    @SerializedName("nlinea")
    private String nlinea;

    @SerializedName("sfamilia")
    private String sfamilia;

    @SerializedName("stecnologia")
    private String stecnologia;

    @SerializedName("scodcomercio")
    private String scodcomercio;

    @SerializedName("snumparte")
    private String snumparte;

    @SerializedName("scodigocolor")
    private String scodigocolor;

    //Tipo TINYINT
    @SerializedName("icantidad")
    private int icantidad;

    //Tipo TINYINT
    @SerializedName("relleno")
    private int relleno;

    public DiusAlbaranesDB(String idalbaran, String salmacen, String sfecha, String scliente, String scod_modelo, String smodelo, String stipo_stock, String sestado, String snum_serie, int itipo, int iestadoenvio, String nlinea, String sfamilia, String stecnologia, String scodcomercio, String snumparte, String scodigocolor, int icantidad, int relleno) {
        this.idalbaran = idalbaran;
        this.salmacen = salmacen;
        this.sfecha = sfecha;
        this.scliente = scliente;
        this.scod_modelo = scod_modelo;
        this.smodelo = smodelo;
        this.stipo_stock = stipo_stock;
        this.sestado = sestado;
        this.snum_serie = snum_serie;
        this.itipo = itipo;
        this.iestadoenvio = iestadoenvio;
        this.nlinea = nlinea;
        this.sfamilia = sfamilia;
        this.stecnologia = stecnologia;
        this.scodcomercio = scodcomercio;
        this.snumparte = snumparte;
        this.scodigocolor = scodigocolor;
        this.icantidad = icantidad;
        this.relleno = relleno;
    }

    public String getIdalbaran() {
        return idalbaran;
    }

    public void setIdalbaran(String idalbaran) {
        this.idalbaran = idalbaran;
    }

    public String getSalmacen() {
        return salmacen;
    }

    public void setSalmacen(String salmacen) {
        this.salmacen = salmacen;
    }

    public String getSfecha() {
        return sfecha;
    }

    public void setSfecha(String sfecha) {
        this.sfecha = sfecha;
    }

    public String getScliente() {
        return scliente;
    }

    public void setScliente(String scliente) {
        this.scliente = scliente;
    }

    public String getScod_modelo() {
        return scod_modelo;
    }

    public void setScod_modelo(String scod_modelo) {
        this.scod_modelo = scod_modelo;
    }

    public String getSmodelo() {
        return smodelo;
    }

    public void setSmodelo(String smodelo) {
        this.smodelo = smodelo;
    }

    public String getStipo_stock() {
        return stipo_stock;
    }

    public void setStipo_stock(String stipo_stock) {
        this.stipo_stock = stipo_stock;
    }

    public String getSestado() {
        return sestado;
    }

    public void setSestado(String sestado) {
        this.sestado = sestado;
    }

    public String getSnum_serie() {
        return snum_serie;
    }

    public void setSnum_serie(String snum_serie) {
        this.snum_serie = snum_serie;
    }

    public int getItipo() {
        return itipo;
    }

    public void setItipo(int itipo) {
        this.itipo = itipo;
    }

    public int getIestadoenvio() {
        return iestadoenvio;
    }

    public void setIestadoenvio(int iestadoenvio) {
        this.iestadoenvio = iestadoenvio;
    }

    public String getNlinea() {
        return nlinea;
    }

    public void setNlinea(String nlinea) {
        this.nlinea = nlinea;
    }

    public String getSfamilia() {
        return sfamilia;
    }

    public void setSfamilia(String sfamilia) {
        this.sfamilia = sfamilia;
    }

    public String getStecnologia() {
        return stecnologia;
    }

    public void setStecnologia(String stecnologia) {
        this.stecnologia = stecnologia;
    }

    public String getScodcomercio() {
        return scodcomercio;
    }

    public void setScodcomercio(String scodcomercio) {
        this.scodcomercio = scodcomercio;
    }

    public String getSnumparte() {
        return snumparte;
    }

    public void setSnumparte(String snumparte) {
        this.snumparte = snumparte;
    }

    public String getScodigocolor() {
        return scodigocolor;
    }

    public void setScodigocolor(String scodigocolor) {
        this.scodigocolor = scodigocolor;
    }

    public int getIcantidad() {
        return icantidad;
    }

    public void setIcantidad(int icantidad) {
        this.icantidad = icantidad;
    }

    public int getRelleno() {
        return relleno;
    }

    public void setRelleno(int relleno) {
        this.relleno = relleno;
    }
}
