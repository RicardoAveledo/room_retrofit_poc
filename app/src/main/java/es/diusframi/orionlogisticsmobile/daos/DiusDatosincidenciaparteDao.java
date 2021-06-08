package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusDatosincidenciaparteDB;

@Dao
public interface DiusDatosincidenciaparteDao {

    @Insert
    public void insert(DiusDatosincidenciaparteDB... diusDatosincidenciaparteDB);

    @Update
    public void update(DiusDatosincidenciaparteDB... diusDatosincidenciaparteDB);

    @Delete
    public void delete(DiusDatosincidenciaparteDB diusDatosincidenciaparteDB);

    @Query("SELECT * FROM dius_datosincidenciaparte")
    public List<DiusDatosincidenciaparteDB> getDiusDatosincidenciaparteDB();

    @Query("DELETE FROM dius_datosincidenciaparte")
    public void deleteDiusDatosincidenciaparteDB();

}
