package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.TmpAlbaranesagrupadosDB;

@Dao
public interface TmpAlbaranesagrupadosDao {
    @Insert
    public void insert(TmpAlbaranesagrupadosDB... tmpAlbaranesagrupadosDB);

    @Update
    public void update(TmpAlbaranesagrupadosDB... tmpAlbaranesagrupadosDB);

    @Delete
    public void delete(TmpAlbaranesagrupadosDB tmpAlbaranesagrupadosDB);

    @Query("SELECT * FROM tmp_albaranesagrupados")
    public List<TmpAlbaranesagrupadosDB> getTmpAlbaranesagrupadosDB();

    @Query("DELETE FROM tmp_albaranesagrupados")
    public void deleteTmpAlbaranesagrupadosDB();
}
