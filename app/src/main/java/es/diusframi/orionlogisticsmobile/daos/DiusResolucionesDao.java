package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusResolucionesDB;

@Dao
public interface DiusResolucionesDao {
    @Insert
    public void insert(DiusResolucionesDB... diusResolucionesDB);

    @Update
    public void update(DiusResolucionesDB... diusResolucionesDB);

    @Delete
    public void delete(DiusResolucionesDB diusResolucionesDB);

    @Query("SELECT * FROM dius_resoluciones")
    public List<DiusResolucionesDB> getDiusResolucionesDB();

    @Query("DELETE FROM dius_resoluciones")
    public void deleteDiusResolucionesDB();
}
