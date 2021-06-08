package es.diusframi.orionlogisticsmobile.models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by RicardoAveledo on 06/10/2020.
 */
public interface GetDataService {

    //Traer Usuarios
    @GET("users/")
    Call<List<User>> getAllUsers();

    //Hacer Login
    @FormUrlEncoded
    @POST("users/login")
    Call<User> login(@Field("mail") String mail, @Field("pass") String pass);

    //Registrar movimiento UL
    @FormUrlEncoded
    @POST("ul/recepcion/")
    Call<String> ulRecepcion(@Field("TIPO_MOV") String tipo_mov,
                             @Field("CODIGO_UL") String codigo_ul,
                             @Field("ALMACEN_ANTERIOR") String almacen_anterior,
                             @Field("UBICACION_ANTERIOR") String ubicacion_anterior,
                             @Field("ALMACEN_NUEVO") String almacen_nuevo,
                             @Field("UBICACION_NUEVA") String ubicacion_nueva,
                             @Field("SERIE_ESCANEADO") int escaneado);

    //Traer la data del UL
    @GET("ul/recepcion/{ul}")
    Call<ULRecepcion> ulRecepcion(@Path("ul") String ul);

    //Traer la data del UL
    @GET("desddi/62/0/0/{from}/{size}/1")
    Call<Casuisticas> casuisticaAcciones(@Path("from") String from,@Path("size") String size);

    //Traer el equipo:
    @GET("equipo/movimiento/{serie}")
    Call<List<Equipo> /*SerieEquipo*/> serieEquipo(@Path("serie") String serie);

    //Registrar el movimiento del equipo
    @FormUrlEncoded
    @POST("equipo/movimiento/")
    Call<String> movimientoEquipos(@Field("TIPO_MOV") String tipo_mov,
                             @Field("CODIGO_UL") String codigo_ul,
                             @Field("ALMACEN_ANTERIOR") String almacen_anterior,
                             @Field("UBICACION_ANTERIOR") String ubicacion_anterior,
                             @Field("ALMACEN_NUEVO") String almacen_nuevo,
                             @Field("UBICACION_NUEVA") String ubicacion_nueva,
                             @Field("CODIGO_UL_NUEVO") String codigo_ul_nuevo,
                             @Field("MULTIPLE") String multiple);

}