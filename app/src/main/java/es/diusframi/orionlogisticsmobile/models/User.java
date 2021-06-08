package es.diusframi.orionlogisticsmobile.models;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by RicardoAveledo on 06/10/2020.
 */
@Entity(tableName = "user")
public class User {

    @PrimaryKey
    @NonNull
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("mail")
    private String mail;
    @SerializedName("token")
    private String token;
    @SerializedName("image")
    private String image;
    @TypeConverters(AlmacenesConverter.class)
    @SerializedName("almacenes")
    private List<Almacen> almacenes;

    public User(String id, String name, String mail, String token, String image, List<Almacen> almacenes) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.token = token;
        this.image = image;
        this.almacenes = almacenes;
    }

    public List<Almacen> getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(List<Almacen> almacenes) {
        this.almacenes = almacenes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}