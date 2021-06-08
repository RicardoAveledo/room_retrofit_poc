package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusGastosDB;

@Dao
public interface DiusGastosDao {
    @Insert
    public void insert(DiusGastosDB... diusGastosDB);

    @Update
    public void update(DiusGastosDB... diusGastosDB);

    @Delete
    public void delete(DiusGastosDB diusGastosDB);

    @Query("SELECT * FROM dius_gastos")
    public List<DiusGastosDB> getDiusGastosDB();

    @Query("DELETE FROM dius_gastos")
    public void deleteDiusGastosDB();
}
