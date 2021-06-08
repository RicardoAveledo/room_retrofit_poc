package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.DiusDatosllamadaparteDB;

@Dao
public interface DiusDatosllamadaparteDao {

    @Insert
    public void insert(DiusDatosllamadaparteDB... diusDatosllamadaparteDB);

    @Update
    public void update(DiusDatosllamadaparteDB... diusDatosllamadaparteDB);

    @Delete
    public void delete(DiusDatosllamadaparteDB diusDatosllamadaparteDB);

    @Query("SELECT * FROM dius_datosllamadaparte")
    public List<DiusDatosllamadaparteDB> getDiusDatosllamadaparteDB();

    @Query("DELETE FROM dius_datosllamadaparte")
    public void deleteDiusDatosllamadaparteDB();

}
