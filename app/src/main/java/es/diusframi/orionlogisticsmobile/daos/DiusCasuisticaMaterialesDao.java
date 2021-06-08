package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusCasuisticaMaterialesDB;

@Dao
public interface DiusCasuisticaMaterialesDao {

    @Insert
    public void insert(DiusCasuisticaMaterialesDB... diusCasuisticaMaterialesDB);

    @Update
    public void update(DiusCasuisticaMaterialesDB... diusCasuisticaMaterialesDB);

    @Delete
    public void delete(DiusCasuisticaMaterialesDB diusCasuisticaMaterialesDB);

    @Query("SELECT * FROM dius_casuistica_materiales")
    public List<DiusCasuisticaMaterialesDB> getDiusCasuisticaMaterialesDB();

    @Query("DELETE FROM dius_casuistica_materiales")
    public void deleteDiusCasuisticaMaterialesDB();

}
