package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusPendientesDB;

@Dao
public interface DiusPendientesDao {
    @Insert
    public void insert(DiusPendientesDB... diusPendientesDB);

    @Update
    public void update(DiusPendientesDB... diusPendientesDB);

    @Delete
    public void delete(DiusPendientesDB diusPendientesDB);

    @Query("SELECT * FROM dius_pendientes")
    public List<DiusPendientesDB> getDiusPendientesDB();

    @Query("DELETE FROM dius_pendientes")
    public void deleteDiusPendientesDB();
}
