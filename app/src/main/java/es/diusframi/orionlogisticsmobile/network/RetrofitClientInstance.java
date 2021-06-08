package es.diusframi.orionlogisticsmobile.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by RicardoAveledo on 06/10/2020.
 */
public class RetrofitClientInstance {

    private static Retrofit retrofit;
    //Produccion
    //private static final String BASE_URL = "https://logistics.diusframi.es/api/";

    //Casuisticas check.
    private static final String BASE_URL = "http://orionmobilews.diusframi.es:33223/orionMobile/wsHHRest.php/tablasCasuistica/";

    //Desarrollo
    //private static final String BASE_URL = "https://ol2des.ofimedia.eu/orionlab/orionlogistics/api/";

    public static Retrofit getRetrofitInstance() {
       if (retrofit == null) {
            TokenInterceptor interceptor=new TokenInterceptor();

            OkHttpClient client = new OkHttpClient.Builder()
                    //Descomentar
              //      .addInterceptor(interceptor)
                    .callTimeout(120, TimeUnit.SECONDS)
                    .readTimeout(120,TimeUnit.SECONDS)
                    .build();

            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
