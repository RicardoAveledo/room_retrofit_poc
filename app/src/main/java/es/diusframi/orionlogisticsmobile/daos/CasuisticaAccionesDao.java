package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.CasuisticaAcciones;
import es.diusframi.orionlogisticsmobile.models.CasuisticaAccionesDB;
import es.diusframi.orionlogisticsmobile.models.User;

/**
 * Created by RicardoAveledo on 08/10/2020.
 */

@Dao
public interface  CasuisticaAccionesDao {
    @Insert
    public void insert(CasuisticaAccionesDB... casuisticaAccionesDB);

    @Update
    public void update(CasuisticaAccionesDB... casuisticaAccionesDB);

    @Delete
    public void delete(CasuisticaAccionesDB casuisticaAccionesDB);

    @Query("SELECT * FROM casuisticaAccionesDB")
    public List<CasuisticaAccionesDB> getCasuisticaAccionesDB();

    @Query("DELETE FROM casuisticaAccionesDB")
    public void deleteCasuisticaAccionesDB();
}
