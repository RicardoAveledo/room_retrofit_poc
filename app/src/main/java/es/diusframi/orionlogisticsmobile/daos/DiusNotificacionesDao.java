package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusNotificacionesDB;

@Dao
public interface DiusNotificacionesDao {

    @Insert
    public void insert(DiusNotificacionesDB... diusNotificacionesDB);

    @Update
    public void update(DiusNotificacionesDB... diusNotificacionesDB);

    @Delete
    public void delete(DiusNotificacionesDB diusNotificacionesDB);

    @Query("SELECT * FROM dius_notificaciones")
    public List<DiusNotificacionesDB> getDiusNotificacionesDB();

    @Query("DELETE FROM dius_notificaciones")
    public void deleteDiusNotificacionesDB();
}
