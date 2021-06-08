package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusComplementosDB;

@Dao
public interface DiusComplementosDao {

    @Insert
    public void insert(DiusComplementosDB... diusComplementosDB);

    @Update
    public void update(DiusComplementosDB... diusComplementosDB);

    @Delete
    public void delete(DiusComplementosDB diusComplementosDB);

    @Query("SELECT * FROM dius_complementos")
    public List<DiusComplementosDB> getDiusComplementosDB();

    @Query("DELETE FROM dius_complementos")
    public void deleteDiusComplementosDB();

}
