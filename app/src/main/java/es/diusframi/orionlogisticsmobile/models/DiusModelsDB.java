package es.diusframi.orionlogisticsmobile.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_models")
public class DiusModelsDB {

    @PrimaryKey
    @SerializedName("idmodel")
    private int idmodel;

    //Este campo es de tipo NVARCHAR(60)
    @SerializedName("description")
    private String description;

    @SerializedName("clientid")
    private int clientid;

    @SerializedName("codigo")
    private String codigo;

    @SerializedName("tipo")
    private String tipo;

    @SerializedName("modelo")
    private int modelo;

    @SerializedName("conectividad")
    private int conectividad;

    @SerializedName("tecnologia")
    private int tecnologia;

    @SerializedName("idcompania")
    private String idcompania;

    @SerializedName("serie")
    private int serie;

    @SerializedName("longitud_serie")
    private int longitud_serie;

    @SerializedName("productos_asociados")
    private String productos_asociados;

    @SerializedName("generico")
    private int generico;

    public DiusModelsDB(int idmodel, String description, int clientid, String codigo, String tipo, int modelo, int conectividad, int tecnologia, String idcompania, int serie, int longitud_serie, String productos_asociados, int generico) {
        this.idmodel = idmodel;
        this.description = description;
        this.clientid = clientid;
        this.codigo = codigo;
        this.tipo = tipo;
        this.modelo = modelo;
        this.conectividad = conectividad;
        this.tecnologia = tecnologia;
        this.idcompania = idcompania;
        this.serie = serie;
        this.longitud_serie = longitud_serie;
        this.productos_asociados = productos_asociados;
        this.generico = generico;
    }

    public int getIdmodel() {
        return idmodel;
    }

    public void setIdmodel(int idmodel) {
        this.idmodel = idmodel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getConectividad() {
        return conectividad;
    }

    public void setConectividad(int conectividad) {
        this.conectividad = conectividad;
    }

    public int getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getIdcompania() {
        return idcompania;
    }

    public void setIdcompania(String idcompania) {
        this.idcompania = idcompania;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getLongitud_serie() {
        return longitud_serie;
    }

    public void setLongitud_serie(int longitud_serie) {
        this.longitud_serie = longitud_serie;
    }

    public String getProductos_asociados() {
        return productos_asociados;
    }

    public void setProductos_asociados(String productos_asociados) {
        this.productos_asociados = productos_asociados;
    }

    public int getGenerico() {
        return generico;
    }

    public void setGenerico(int generico) {
        this.generico = generico;
    }
}
