package es.diusframi.orionlogisticsmobile.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "dius_pendientes")
public class DiusPendientesDB {


    @SerializedName("itipoenvio") //Este campo es de tipo smallint
    private int itipoenvio;

    //Este campo es de tipo nvarchar(100)
    @SerializedName("iddato")
    private String iddato;

    // Este campo es DATETIME hay que hacer un typeConverter
    @SerializedName("dfecha")
    private String dfecha;

    //Este campo es de tipo nvarchar(100)
    @SerializedName("dato2")
    private String dato2;

    @PrimaryKey
    @SerializedName("idpendientes") //PRIMARY KEY("idpendientes" AUTOINCREMENT)
    private int idpendientes;

    public DiusPendientesDB(int itipoenvio, String iddato, String dfecha, String dato2, int idpendientes) {
        this.itipoenvio = itipoenvio;
        this.iddato = iddato;
        this.dfecha = dfecha;
        this.dato2 = dato2;
        this.idpendientes = idpendientes;
    }

    public int getItipoenvio() {
        return itipoenvio;
    }

    public void setItipoenvio(int itipoenvio) {
        this.itipoenvio = itipoenvio;
    }

    public String getIddato() {
        return iddato;
    }

    public void setIddato(String iddato) {
        this.iddato = iddato;
    }

    public String getDfecha() {
        return dfecha;
    }

    public void setDfecha(String dfecha) {
        this.dfecha = dfecha;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public int getIdpendientes() {
        return idpendientes;
    }

    public void setIdpendientes(int idpendientes) {
        this.idpendientes = idpendientes;
    }
}
