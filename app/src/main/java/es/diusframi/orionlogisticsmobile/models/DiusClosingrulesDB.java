package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_closingrules")
public class DiusClosingrulesDB {

    @PrimaryKey
    @SerializedName("idclosingrule")
    private int idclosingrule;

    @SerializedName("clientid")
    private int clientid;

    //Tipo NVARCHAR(1)
    @SerializedName("tipo_trabajo")
    private String tipo_trabajo;

    //Tipo NVARCHAR(1)
    @SerializedName("situation")
    private String situation;

    //Tipo NVARCHAR(4)
    @SerializedName("code")
    private String code;

    //Tipo NVARCHAR(250)
    @SerializedName("description")
    private String description;

    //Tipo NVARCHAR(4)
    @SerializedName("requiredsignature")
    private String requiredsignature;

    @SerializedName("requiredphoto")
    private int requiredphoto;

    @SerializedName("requiredobservations")
    private int requiredobservations;

    @SerializedName("install")
    private int install;

    @SerializedName("remove")
    private int remove;

    @SerializedName("calendar")
    private int calendar;

    public DiusClosingrulesDB(int idclosingrule, int clientid, String tipo_trabajo, String situation, String code, String description, String requiredsignature, int requiredphoto, int requiredobservations, int install, int remove, int calendar) {
        this.idclosingrule = idclosingrule;
        this.clientid = clientid;
        this.tipo_trabajo = tipo_trabajo;
        this.situation = situation;
        this.code = code;
        this.description = description;
        this.requiredsignature = requiredsignature;
        this.requiredphoto = requiredphoto;
        this.requiredobservations = requiredobservations;
        this.install = install;
        this.remove = remove;
        this.calendar = calendar;
    }

    public int getIdclosingrule() {
        return idclosingrule;
    }

    public void setIdclosingrule(int idclosingrule) {
        this.idclosingrule = idclosingrule;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequiredsignature() {
        return requiredsignature;
    }

    public void setRequiredsignature(String requiredsignature) {
        this.requiredsignature = requiredsignature;
    }

    public int getRequiredphoto() {
        return requiredphoto;
    }

    public void setRequiredphoto(int requiredphoto) {
        this.requiredphoto = requiredphoto;
    }

    public int getRequiredobservations() {
        return requiredobservations;
    }

    public void setRequiredobservations(int requiredobservations) {
        this.requiredobservations = requiredobservations;
    }

    public int getInstall() {
        return install;
    }

    public void setInstall(int install) {
        this.install = install;
    }

    public int getRemove() {
        return remove;
    }

    public void setRemove(int remove) {
        this.remove = remove;
    }

    public int getCalendar() {
        return calendar;
    }

    public void setCalendar(int calendar) {
        this.calendar = calendar;
    }
}
