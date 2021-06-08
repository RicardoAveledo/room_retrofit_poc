package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusObservationDB;

@Dao
public interface DiusObservationDao {
    @Insert
    public void insert(DiusObservationDB... diusObservationDB);

    @Update
    public void update(DiusObservationDB... diusObservationDB);

    @Delete
    public void delete(DiusObservationDB diusObservationDB);

    @Query("SELECT * FROM dius_observation")
    public List<DiusObservationDB> getDiusObservationDB();

    @Query("DELETE FROM dius_observation")
    public void deleteDiusObservationDB();
}
