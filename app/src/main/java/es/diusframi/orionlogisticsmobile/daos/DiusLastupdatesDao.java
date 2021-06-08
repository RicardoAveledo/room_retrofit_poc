package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusLastupdatesDB;

@Dao
public interface DiusLastupdatesDao {
    @Insert
    public void insert(DiusLastupdatesDB... diusLastupdatesDB);

    @Update
    public void update(DiusLastupdatesDB... diusLastupdatesDB);

    @Delete
    public void delete(DiusLastupdatesDB diusLastupdatesDB);

    @Query("SELECT * FROM dius_lastupdates")
    public List<DiusLastupdatesDB> getDiusLastupdatesDB();

    @Query("DELETE FROM dius_lastupdates")
    public void deleteDiusLastupdatesDB();
}
