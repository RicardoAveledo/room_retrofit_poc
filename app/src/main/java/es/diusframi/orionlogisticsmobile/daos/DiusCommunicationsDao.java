package es.diusframi.orionlogisticsmobile.daos;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusCommunicationsDB;

@Dao
public interface DiusCommunicationsDao {

    @Insert
    public void insert(DiusCommunicationsDB... diusCommunicationsDB);

    @Update
    public void update(DiusCommunicationsDB... diusCommunicationsDB);

    @Delete
    public void delete(DiusCommunicationsDB diusCommunicationsDB);

    @Query("SELECT * FROM dius_communications")
    public List<DiusCommunicationsDB> getDiusCommunicationsDB();

    @Query("DELETE FROM dius_communications")
    public void deleteDiusCommunicationsDB();

}
