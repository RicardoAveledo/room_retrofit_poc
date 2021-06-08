package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by RicardoAveledo on 23/11/2020.
 */
@Entity(tableName = "listEquiposTable")
public class ListEquipos {

    @SerializedName("")
    private List<Equipo> listEquipos;

    public ListEquipos(List<Equipo> listEquipos) {
        this.listEquipos = listEquipos;
    }

    public List<Equipo> getListEquipos() {
        return listEquipos;
    }

    public void setListEquipos(List<Equipo> listEquipos) {
        this.listEquipos = listEquipos;
    }
}
