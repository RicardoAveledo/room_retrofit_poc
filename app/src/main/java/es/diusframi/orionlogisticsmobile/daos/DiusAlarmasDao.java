package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;

/**
 * Created by RicardoAveledo on 01/06/2021.
 */
@Dao
public interface DiusAlarmasDao {
    @Insert
    public void insert(DiusAlarmasDB... diusAlarmasDB);

    @Update
    public void update(DiusAlarmasDB... diusAlarmasDB);

    @Delete
    public void delete(DiusAlarmasDB diusAlarmasDB);

    @Query("SELECT * FROM dius_alarmas")
    public List<DiusAlarmasDB> getDiusAlarmasDB();

    @Query("DELETE FROM dius_alarmas")
    public void deleteDiusAlarmasDB();
}
