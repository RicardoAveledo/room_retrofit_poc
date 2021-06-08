package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_communications")
public class DiusCommunicationsDB {

    @PrimaryKey
    @SerializedName("idcommunication")
    private int idcommunication;

    //Tipo NVARCHAR(50)
    @SerializedName("description")
    private String description;

    public DiusCommunicationsDB(int idcommunication, String description) {
        this.idcommunication = idcommunication;
        this.description = description;
    }

    public int getIdcommunication() {
        return idcommunication;
    }

    public void setIdcommunication(int idcommunication) {
        this.idcommunication = idcommunication;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
