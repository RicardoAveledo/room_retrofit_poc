package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusBusinessunitsDB;

@Dao
public interface DiusBusinessunitsDao {
    @Insert
    public void insert(DiusBusinessunitsDB... diusBusinessunitsDB);

    @Update
    public void update(DiusBusinessunitsDB... diusBusinessunitsDB);

    @Delete
    public void delete(DiusBusinessunitsDB diusBusinessunitsDB);

    @Query("SELECT * FROM dius_businessunits")
    public List<DiusBusinessunitsDB> getDiusBusinessunitsDB();

    @Query("DELETE FROM dius_businessunits")
    public void deleteDiusBusinessunitsDB();
}
