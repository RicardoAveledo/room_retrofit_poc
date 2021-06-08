package es.diusframi.orionlogisticsmobile.models;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Created by RicardoAveledo on 05/02/2021.
 */
public class AlmacenesConverter {

        // Siempre que haya que buscar un array dentro del response, la List deberá tomarse con un Converter.
        @TypeConverter
        public static List<Almacen> storedStringToMyObjects(String data) {
            Gson gson = new Gson();
            if (data == null) {
                return Collections.emptyList();
            }
            Type listType = new TypeToken<List<Almacen>>() {
            }.getType();
            return gson.fromJson(data, listType);
        }

        @TypeConverter
        public static String myObjectsToStoredString(List<Almacen> myObjects) {
            Gson gson = new Gson();
            return gson.toJson(myObjects);
        }
    }