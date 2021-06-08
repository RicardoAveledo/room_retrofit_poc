package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.google.gson.annotations.SerializedName;

import java.util.List;


/**
 * Created by RicardoAveledo on 23/11/2020.
 */
@Entity(tableName = "casuisticas")
public class Casuisticas {

    @TypeConverters(CasuisticaConverter.class)
    @SerializedName("CASUISTICA_ACCIONES")
    private List<CasuisticaAcciones> casuistica_acciones;

    public Casuisticas(List<CasuisticaAcciones> casuistica_acciones) {
        this.casuistica_acciones = casuistica_acciones;
    }

    public List<CasuisticaAcciones> getCasuistica_acciones() {
        return casuistica_acciones;
    }

    public void setCasuistica_acciones(List<CasuisticaAcciones> casuistica_acciones) {
        this.casuistica_acciones = casuistica_acciones;
    }
}
