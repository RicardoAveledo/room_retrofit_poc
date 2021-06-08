package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusClosingrulesDB;

@Dao
public interface DiusClosingrulesDao {

    @Insert
    public void insert(DiusClosingrulesDB... diusClosingrulesDB);

    @Update
    public void update(DiusClosingrulesDB... diusClosingrulesDB);

    @Delete
    public void delete(DiusClosingrulesDB diusClosingrulesDB);

    @Query("SELECT * FROM dius_closingrules")
    public List<DiusClosingrulesDB> getDiusClosingrulesDB();

    @Query("DELETE FROM dius_closingrules")
    public void deleteDiusClosingrulesDB();

}
