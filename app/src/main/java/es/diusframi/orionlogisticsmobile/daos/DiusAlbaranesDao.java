package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlbaranesDB;

@Dao
public interface DiusAlbaranesDao {

    @Insert
    public void insert(DiusAlbaranesDB... diusAlbaranesDB);

    @Update
    public void update(DiusAlbaranesDB... diusAlbaranesDB);

    @Delete
    public void delete(DiusAlbaranesDB diusAlbaranesDB);

    @Query("SELECT * FROM dius_albaranes")
    public List<DiusAlbaranesDB> getDiusAlbaranesDB();

    @Query("DELETE FROM dius_albaranes")
    public void deleteDiusAlbaranesDB();

}
