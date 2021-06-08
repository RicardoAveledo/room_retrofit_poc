package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "tmp_albaranesagrupados")
public class TmpAlbaranesagrupadosDB {

    @PrimaryKey
    @NonNull
    @SerializedName("idalbaran") //Este campo es de tipo nvarchar(20)
    private String idalbaran;

    //Este campo es de tipo nvarchar(100)
    @SerializedName("salmacen")
    private String salmacen;

    //Este campo es de tipo nvarchar(20)
    @SerializedName("sfecha")
    private String sfecha;

    //Este campo es de tipo tinyint
    @SerializedName("itipo")
    private int itipo;

    //Este campo es de tipo tinyint
    @SerializedName("iestadoenvio")
    private int iestadoenvio;

    public TmpAlbaranesagrupadosDB(String idalbaran, String salmacen, String sfecha, int itipo, int iestadoenvio) {
        this.idalbaran = idalbaran;
        this.salmacen = salmacen;
        this.sfecha = sfecha;
        this.itipo = itipo;
        this.iestadoenvio = iestadoenvio;
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
}
