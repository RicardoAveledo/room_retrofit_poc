package es.diusframi.orionlogisticsmobile.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import es.diusframi.orionlogisticsmobile.models.User;

/**
 * Created by RicardoAveledo on 08/10/2020.
 */

@Dao
public interface  UserDao {
    @Insert
    public void insert(User... users);

    @Update
    public void update(User... users);

    @Delete
    public void delete(User user);

    @Query("SELECT * FROM user")
    public List<User> getUsers();

    @Query("DELETE FROM user")
    public void deleteUsers();
}
