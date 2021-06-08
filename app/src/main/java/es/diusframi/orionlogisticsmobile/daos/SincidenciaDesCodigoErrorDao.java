package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.SincidenciaDesCodigoErrorDB;

@Dao
public interface SincidenciaDesCodigoErrorDao {

    @Insert
    public void insert(SincidenciaDesCodigoErrorDB... sincidenciaDesCodigoErrorDB);

    @Update
    public void update(SincidenciaDesCodigoErrorDB... sincidenciaDesCodigoErrorDB);

    @Delete
    public void delete(SincidenciaDesCodigoErrorDB sincidenciaDesCodigoErrorDB);

    @Query("SELECT * FROM sincidencia_des_codigo_error")
    public List<SincidenciaDesCodigoErrorDB> getSincidenciaDesCodigoErrorDB();

    @Query("DELETE FROM sincidencia_des_codigo_error")
    public void deleteSincidenciaDesCodigoErrorDB();

}
