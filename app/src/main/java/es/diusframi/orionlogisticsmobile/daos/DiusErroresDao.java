package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusErroresDB;

@Dao
public interface DiusErroresDao {

    @Insert
    public void insert(DiusErroresDB... diusErroresDB);

    @Update
    public void update(DiusErroresDB... diusErroresDB);

    @Delete
    public void delete(DiusErroresDB diusErroresDB);

    @Query("SELECT * FROM dius_errores")
    public List<DiusErroresDB> getDiusErroresDB();

    @Query("DELETE FROM dius_errores")
    public void deleteDiusErroresDB();
}
