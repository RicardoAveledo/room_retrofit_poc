package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusFotosparteDB;

@Dao
public interface DiusFotosparteDao {
    @Insert
    public void insert(DiusFotosparteDB... diusFotosparteDB);

    @Update
    public void update(DiusFotosparteDB... diusFotosparteDB);

    @Delete
    public void delete(DiusFotosparteDB diusFotosparteDB);

    @Query("SELECT * FROM dius_fotosparte")
    public List<DiusFotosparteDB> getDiusFotosparteDB();

    @Query("DELETE FROM dius_fotosparte")
    public void deleteDiusFotosparteDB();
}
