package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_gastos")
public class DiusGastosDB {

    @PrimaryKey
    @NonNull
    @SerializedName("idgasto")
    private int idgasto;

    //Tipo nvarchar(40)
    @SerializedName("sgasto")
    private String sgasto;

    //CONSTRAINT "PK__dius_gastos__000000000000005F" PRIMARY KEY("idgasto")

    public DiusGastosDB(int idgasto, String sgasto) {
        this.idgasto = idgasto;
        this.sgasto = sgasto;
    }

    public int getIdgasto() {
        return idgasto;
    }

    public void setIdgasto(int idgasto) {
        this.idgasto = idgasto;
    }

    public String getSgasto() {
        return sgasto;
    }

    public void setSgasto(String sgasto) {
        this.sgasto = sgasto;
    }
}
