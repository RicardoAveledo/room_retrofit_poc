package es.diusframi.orionlogisticsmobile.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import es.diusframi.orionlogisticsmobile.R;
import es.diusframi.orionlogisticsmobile.daos.CasuisticaAccionesDao;
import es.diusframi.orionlogisticsmobile.daos.DiusAlarmasDao;
import es.diusframi.orionlogisticsmobile.daos.OLMDatabase;
import es.diusframi.orionlogisticsmobile.daos.UserDao;
import es.diusframi.orionlogisticsmobile.models.CasuisticaAcciones;
import es.diusframi.orionlogisticsmobile.models.CasuisticaAccionesDB;
import es.diusframi.orionlogisticsmobile.models.Casuisticas;
import es.diusframi.orionlogisticsmobile.models.DiusAlarmasDB;
import es.diusframi.orionlogisticsmobile.models.GetDataService;
import es.diusframi.orionlogisticsmobile.models.User;
import es.diusframi.orionlogisticsmobile.network.RetrofitClientInstance;
import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;
import okhttp3.internal.Util;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by RicardoAveledo on 01/10/2020.
 */
public class LoginActivity extends AppCompatActivity {

    Context context;
    TextInputEditText email;
    TextInputEditText password;
    List<CasuisticaAcciones> casuisticasTotales = new ArrayList<>();
    List<CasuisticaAccionesDB> casuisticasTotalesDB = new ArrayList<>();
    int registros = 0;
    int registrosAGuardar = 0;
    int size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = this;
        size = 15000;
        email = (TextInputEditText)findViewById(R.id.email);
        password = (TextInputEditText)findViewById(R.id.password);



        OLMDatabase database = Room.databaseBuilder(context, OLMDatabase.class, "db-casuisticas-convert")
                .allowMainThreadQueries()   //Allows room to do operation on main thread
                .build();
        CasuisticaAccionesDao casuisticasDao = database.getCasuisticaAccionesDao();
        DiusAlarmasDao alarmasDao = database.getDiusAlarmasDao();
        DiusAlarmasDB diusAlarmasDB = new DiusAlarmasDB(0,"0","I","I","I");
        alarmasDao.insert(diusAlarmasDB);

        database.close();


        TextView signinButton = findViewById(R.id.sign_in_button);
        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TESTING FOR ROOM RETROFIT OM REFACTORIZATION. CASUISTICAS. BORRAR:


                Log.d("ACTUALIZANDOCASUISTICAS", "0");
                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                //Call<User> callLogin = service.login("raveledo@diusframi.es","1234abcd");
                Call<Casuisticas> callCasuistica = service.casuisticaAcciones("0",size+"");
                callCasuistica.enqueue(new Callback<Casuisticas>() {
                    @Override
                    public void onResponse(Call<Casuisticas> token, Response<Casuisticas> response) {
                        Casuisticas casuisticas = null;
                        int code = 0;
                        try {
                            code = response.code();
                            casuisticas = response.body();
                            List<CasuisticaAcciones> casuisticaAux = casuisticas.getCasuistica_acciones();
                            casuisticasTotales.addAll(casuisticaAux);
                            Log.d("ACTUALIZANDOCASUISTICAS", casuisticasTotales.size()+"");
                            String total_registros = casuisticas.getCasuistica_acciones().get(casuisticas.getCasuistica_acciones().size()-1).getTotal_registros();
                            int i = Integer.parseInt(total_registros);
                            registros = i;
                            int totalpartes = i / size;
                            totalpartes = totalpartes + 1;
                            registrosAGuardar = totalpartes;
                            for(int x = 2; x<=totalpartes;x++) {
                                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                                //Call<User> callLogin = service.login("raveledo@diusframi.es","1234abcd");
                                int from = 0;
                                int to = 0;
                                int ultimobloque = 0;
                                ultimobloque = size;
                                if (x == totalpartes) {
                                    ultimobloque = registros - (size * (totalpartes - 1));
                                }
                                from = ((x - 1) * size);
                                to = ((x) * size) - (size - ultimobloque);
                                Log.d("ACTUALIZANDOCASUISTICAS", "SEGMENTO: " + from + " - " + to);
                                Log.d("ACTUALIZANDOCASUISTICAS", "PETICION: " + from + " - " + ultimobloque);
                                Call<Casuisticas> callCasuistica = service.casuisticaAcciones(from+"",ultimobloque+"");
                                callCasuistica.enqueue(new Callback<Casuisticas>() {
                                    @Override
                                    public void onResponse(Call<Casuisticas> token, Response<Casuisticas> response) {
                                        Casuisticas casuisticas = null;
                                        int code = 0;
                                        try {
                                            code = response.code();
                                            casuisticas = response.body();
                                            List<CasuisticaAcciones> casuisticaAux = casuisticas.getCasuistica_acciones();
                                            casuisticasTotales.addAll(casuisticaAux);
                                            Log.d("ACTUALIZANDOCASUISTICAS", "Size del AUX "+casuisticaAux.size());
                                            Log.d("ACTUALIZANDOCASUISTICAS", casuisticasTotales.size()+"");
                                            String total_registros = casuisticas.getCasuistica_acciones().get(casuisticas.getCasuistica_acciones().size()-1).getTotal_registros();
                                            if(casuisticasTotales.size()==registros){
                                                casuisticasTotalesDB = CasuisticaAccionesDB.convert(casuisticasTotales);

                                                //convert to json gson file
                                                Log.d("ACTUALIZANDOCASUISTICAS","Convirtiendo a gson");
                                                try {
                                                    ByteArrayOutputStream byteStream = null;
                                                    try {
                                                       //byteStream = new ByteArrayOutputStream();
                                                       //OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteStream, "UTF-8");
                                                       //JsonWriter writer = new JsonWriter(outputStreamWriter);
                                                       //writer.setIndent("  ");
                                                       //writer.beginArray();
                                                       //Gson gson = new GsonBuilder().create();
                                                       ////Caps at about 95000
                                                       //for(int x=0; x<casuisticasTotalesDB.size(); x++){
                                                       //    gson.toJson(casuisticasTotalesDB.get(x), CasuisticaAccionesDB.class, writer);
                                                       //    Log.d("ACTUALIZANDOCASUISTICAS", "Serialized "+x);
                                                       //}
                                                       //writer.endArray();
                                                       //writer.close();

                                                       ////Cant convert it into string
                                                       //String list = byteStream.toString("UTF-8");

                                                       //Log.d("ACTUALIZANDOCASUISTICAS", "got the string");


                                                       //try {
                                                       //    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).mkdir();
                                                       //    File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS+"/file.txt");
                                                       //    gson.toJson(list, new FileWriter(file));
                                                       //    Log.d("ACTUALIZANDOCASUISTICAS", "saved");
                                                       //} catch (Exception e) {
                                                       //    e.printStackTrace();
                                                       //    Log.d("ACTUALIZANDOCASUISTICAS", "Failed to save file");
                                                       //}
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }

                                                    //new Gson().toJson(123.45, new FileWriter(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)));

                                                    //String casuisticasString = new Gson().toJson(casuisticasTotalesDB);
                                                    //OutputStream out = new OutputStream() {
                                                    //    @Override
                                                    //    public void write(int i) throws IOException {
//
                                                    //    }
                                                    //};
                                                    //JsonWriter writer = new JsonWriter(new OutputStreamWriter(out, "UTF-8"));
                                                    //writer.setIndent("  ");
                                                    //writer.beginArray();
                                                    //for (CasuisticaAccionesDB casuisticaAccionesDB : casuisticasTotalesDB) {
                                                    //    new Gson().toJson(casuisticaAccionesDB, CasuisticaAccionesDB.class, writer);
                                                    //}
                                                    //writer.endArray();
                                                    //writer.close();
                                                } catch (Exception e) {
                                                    Log.d("ACTUALIZANDOCASUISTICAS","Error");
                                                    e.printStackTrace();
                                                }
                                                Log.d("ACTUALIZANDOCASUISTICAS","Convertido");

                                                Toast.makeText(LoginActivity.this, "Listo",Toast.LENGTH_SHORT);

                                                //Instance of the DB
                                                OLMDatabase database = Room.databaseBuilder(context, OLMDatabase.class, "db-casuisticas-convert")
                                                        .allowMainThreadQueries()   //Allows room to do operation on main thread
                                                        .build();
                                                ////Instance of the Table User
                                                CasuisticaAccionesDao casuisticasDao = database.getCasuisticaAccionesDao();
                                                ////Clean the table
                                                casuisticasDao.deleteCasuisticaAccionesDB();
                                                ////Get each user from the Retrofit response to include them into the DB.
                                                ////insert the user into the Users Table
                                                int check = 1;
                                                for(int y=0; y<casuisticasTotalesDB.size(); y++){
                                                    try {
                                                        casuisticasDao.insert(casuisticasTotalesDB.get(y));
                                                        Log.d("ACTUALIZANDOCASUISTICAS", check+"");
                                                        check++;
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                        Log.d("ACTUALIZANDOCASUISTICAS", "Duplicated key" + casuisticasTotalesDB.get(y).getId_casuistica_acciones());
                                                    }
                                                }
                                                database.close();
                                                Toast.makeText(LoginActivity.this, "Guardando en BD",Toast.LENGTH_SHORT);
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();

                                            Log.d("ACTUALIZANDOCASUISTICAS", e+"");
                                            if(code==500){
                                                Toast.makeText(LoginActivity.this, "Error de conexión con el servidor", Toast.LENGTH_SHORT).show();
                                            }else{
                                                Toast.makeText(LoginActivity.this, "Error, verifique el usuario y la contraseña", Toast.LENGTH_SHORT).show();
                                            }

                                        }

                                    }

                                    @Override
                                    public void onFailure(Call<Casuisticas> call, Throwable t) {

                                        Log.d("ACTUALIZANDOCASUISTICAS", t+"");
                                        Toast.makeText(LoginActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }


                        } catch (Exception e) {
                            Log.d("ACTUALIZANDOCASUISTICAS", e+"");
                            e.printStackTrace();
                            if(code==500){
                                Toast.makeText(LoginActivity.this, "Error de conexión con el servidor", Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(LoginActivity.this, "Error, verifique el usuario y la contraseña", Toast.LENGTH_SHORT).show();
                            }

                        }

                    }

                    @Override
                    public void onFailure(Call<Casuisticas> call, Throwable t) {

                        Toast.makeText(LoginActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                    }
                });
                //BORRAR HASTA ACÁ

                //DELETE THIS: ONLY FOR THE HONEYWELL TRYOUT

                //Intent mainActivityIntent = new Intent(context, MainActivity.class);
                //startActivity(mainActivityIntent);

                // DELETE CODE ABOVE


                /*Create handle for the RetrofitInstance interface*/
/*//DESCOMENTAR ESTE BLOQUE DASH ASTERISCO PARA VOLVER AL FUNCIONAMIENTO DE OLM. VOLVER A PONER EL TOKEN INTERCEPTOR Y CAMBIAR EL URL
                GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                //Call<User> callLogin = service.login("raveledo@diusframi.es","1234abcd");
                Call<User> callLogin = service.login(email.getText().toString().trim(),password.getText().toString().trim());
                callLogin.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> token, Response<User> response) {
                        User user = null;
                        int code = 0;
                        try {
                            code = response.code();
                            user = response.body();
                            Utilidades.almacenes = user.getAlmacenes();
                            Utilidades.tokenAPI = user.getToken();

                            //Instance of the DB
                            //OLMDatabase database = Room.databaseBuilder(context, OLMDatabase.class, "db-users")
                            //        .allowMainThreadQueries()   //Allows room to do operation on main thread
                            //        .build();
                            ////Instance of the Table User
                            //UserDao userDAO = database.getUserDao();
                            ////Clean the table
                            //userDAO.deleteUsers();
                            ////Get each user from the Retrofit response to include them into the DB.
                            ////insert the user into the Users Table
                            //userDAO.insert(user);

                            Intent mainActivityIntent = new Intent(context, MainActivity.class);
                            startActivity(mainActivityIntent);
                        } catch (Exception e) {
                            e.printStackTrace();
                            if(code==500){
                                Toast.makeText(LoginActivity.this, "Error de conexión con el servidor", Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(LoginActivity.this, "Error, verifique el usuario y la contraseña", Toast.LENGTH_SHORT).show();
                            }

                        }


                       // //Nested so that the Token is guaranteed to be saved.
                       //
                       // GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
                       // Call<List<User>> call = service.getAllUsers();
                       // call.enqueue(new Callback<List<User>>() {
                       //     @Override
                       //     public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                       //         List<User> users = response.body();
                       //         Toast.makeText(context, "Worked", Toast.LENGTH_SHORT).show();
                        //
                       //         //Instance of the DB
                       //         OLMDatabase database = Room.databaseBuilder(context, OLMDatabase.class, "db-contacts")
                       //                 .allowMainThreadQueries()   //Allows room to do operation on main thread
                       //                 .build();
                       //         //Instance of the Table User
                       //         UserDao userDAO = database.getUserDao();
                       //         //Clean the table
                       //         userDAO.deleteUsers();
                       //         //Get each user from the Retrofit response to include them into the DB.
                       //         for(int i = 0; i < users.size(); i++){
                       //             User user = new User(
                       //                     users.get(i).getImagen(),
                       //                     users.get(i).getNombre(),
                       //                     users.get(i).getCorreo(),
                       //                     users.get(i).getPassword(),
                       //                     users.get(i).getClaveSecreta(),
                       //                     users.get(i).getPermisos(),
                       //                     users.get(i).getAlmacenes(),
                       //                     users.get(i).getIdioma(),
                       //                     users.get(i).getActivo());
                       //             //insert the user into the Users Table
                       //             userDAO.insert(user);
                       //         }
                       //         // Check the usersList in the table Users its properly filled.
                       //         List<User> usersCheckList = userDAO.getUsers();
                       //         Toast.makeText(context, "Users " + usersCheckList.get(0).getNombre(), Toast.LENGTH_SHORT).show();
//
                       //     }
//
                       //     @Override
                       //     public void onFailure(Call<List<User>> call, Throwable t) {
//
                       //         Toast.makeText(LoginActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                       //     }
                       // });
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                        Toast.makeText(LoginActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                    }
                });

                //Get Users:

*/



            }
        });
    }
}