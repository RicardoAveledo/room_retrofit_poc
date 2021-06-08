package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusMaterialesDB;

@Dao
public interface DiusMaterialesDao {

    @Insert
    public void insert(DiusMaterialesDB... diusMaterialesDB);

    @Update
    public void update(DiusMaterialesDB... diusMaterialesDB);

    @Delete
    public void delete(DiusMaterialesDB diusMaterialesDB);

    @Query("SELECT * FROM dius_materiales")
    public List<DiusMaterialesDB> getDiusMaterialesDB();

    @Query("DELETE FROM dius_materiales")
    public void deleteDiusMaterialesDB();

}
