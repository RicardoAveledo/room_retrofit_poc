package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusMaterialesV2DB;

@Dao
public interface DiusMaterialesV2Dao {
    @Insert
    public void insert(DiusMaterialesV2DB... diusMaterialesV2DB);

    @Update
    public void update(DiusMaterialesV2DB... diusMaterialesV2DB);

    @Delete
    public void delete(DiusMaterialesV2DB diusMaterialesV2DB);

    @Query("SELECT * FROM dius_materiales_v2")
    public List<DiusMaterialesV2DB> getDiusMaterialesV2DB();

    @Query("DELETE FROM dius_materiales_v2")
    public void deleteDiusMaterialesV2DB();
}
