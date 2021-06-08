package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusCasuisticaAccionesDB;

@Dao
public interface DiusCasuisticaAccionesDao {

    @Insert
    public void insert(DiusCasuisticaAccionesDB... diusCasuisticaAccionesDB);

    @Update
    public void update(DiusCasuisticaAccionesDB... diusCasuisticaAccionesDB);

    @Delete
    public void delete(DiusCasuisticaAccionesDB diusCasuisticaAccionesDB);

    @Query("SELECT * FROM dius_casuistica_acciones")
    public List<DiusCasuisticaAccionesDB> getDiusCasuisticaAccionesDB();

    @Query("DELETE FROM dius_casuistica_acciones")
    public void deleteDiusCasuisticaAccionesDB();


}
