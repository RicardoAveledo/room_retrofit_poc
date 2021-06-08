package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_observation")
public class DiusObservationDB {

    @PrimaryKey
    @NonNull
    @SerializedName("id_observation") // Este campo es tipo NVARCHAR(50)
    private String id_observation;

    // Este campo es tipo NVARCHAR(50)
    @SerializedName("fathercode")
    private String fathercode;

    // Este campo es tipo NVARCHAR(250)
    @SerializedName("description")
    private String description;

    public DiusObservationDB(@NonNull String id_observation, String fathercode, String description) {
        this.id_observation = id_observation;
        this.fathercode = fathercode;
        this.description = description;
    }

    @NonNull
    public String getId_observation() {
        return id_observation;
    }

    public void setId_observation(@NonNull String id_observation) {
        this.id_observation = id_observation;
    }

    public String getFathercode() {
        return fathercode;
    }

    public void setFathercode(String fathercode) {
        this.fathercode = fathercode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
