package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_complementos")
public class DiusComplementosDB {

    //Tipo nvarchar(11)
    @PrimaryKey
    @NonNull
    @SerializedName("parte")
    private String parte;

    //Tipo nvarchar(100)
    @SerializedName("scomplemento")
    private String scomplemento;

    @SerializedName("marcado")
    private int marcado;

    public DiusComplementosDB(String parte, String scomplemento, int marcado) {
        this.parte = parte;
        this.scomplemento = scomplemento;
        this.marcado = marcado;
    }

    public String getParte() {
        return parte;
    }

    public void setParte(String parte) {
        this.parte = parte;
    }

    public String getScomplemento() {
        return scomplemento;
    }

    public void setScomplemento(String scomplemento) {
        this.scomplemento = scomplemento;
    }

    public int getMarcado() {
        return marcado;
    }

    public void setMarcado(int marcado) {
        this.marcado = marcado;
    }
}
