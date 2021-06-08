package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusModelsDB;

@Dao
public interface DiusModelsDao {
    @Insert
    public void insert(DiusModelsDB... diusModelsDB);

    @Update
    public void update(DiusModelsDB... diusModelsDB);

    @Delete
    public void delete(DiusModelsDB diusModelsDB);

    @Query("SELECT * FROM dius_models")
    public List<DiusModelsDB> getDiusModelsDB();

    @Query("DELETE FROM dius_models")
    public void deleteDiusModelsDB();

}
