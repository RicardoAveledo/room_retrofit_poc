package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;
/**
 * Created by RicardoAveledo on 06/10/2020.
 */
@Entity(tableName = "almacen")
public class Almacen {

    @PrimaryKey
    @NonNull
    @SerializedName("id")
    private String id;
    @SerializedName("text")
    private String text;
    @SerializedName("COD_UBICACION")
    private String codUbicacion;

    public Almacen(@NonNull String id, String text, String codUbicacion) {
        this.id = id;
        this.text = text;
        this.codUbicacion = codUbicacion;
    }

    //This is for the Spinner adapter
    @Override
    public String toString() {
        return this.text;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(String codUbicacion) {
        this.codUbicacion = codUbicacion;
    }
}