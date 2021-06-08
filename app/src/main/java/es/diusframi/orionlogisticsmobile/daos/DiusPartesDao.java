package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusObservationDB;
import es.diusframi.orionlogisticsmobile.models.DiusPartesDB;

@Dao
public interface DiusPartesDao {
    @Insert
    public void insert(DiusPartesDB... diusPartesDB);

    @Update
    public void update(DiusPartesDB... diusPartesDB);

    @Delete
    public void delete(DiusPartesDB diusPartesDB);

    @Query("SELECT * FROM dius_partes")
    public List<DiusPartesDB> getDiusPartesDB();

    @Query("DELETE FROM dius_partes")
    public void deleteDiusPartesDB();
}
