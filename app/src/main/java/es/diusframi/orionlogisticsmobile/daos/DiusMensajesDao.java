package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusMensajesDB;

@Dao
public interface DiusMensajesDao {
    @Insert
    public void insert(DiusMensajesDB... diusMensajesDB);

    @Update
    public void update(DiusMensajesDB... diusMensajesDB);

    @Delete
    public void delete(DiusMensajesDB diusMensajesDB);

    @Query("SELECT * FROM dius_mensajes")
    public List<DiusMensajesDB> getDiusMensajesDB();

    @Query("DELETE FROM dius_mensajes")
    public void deleteDiusMensajesDB();
}
