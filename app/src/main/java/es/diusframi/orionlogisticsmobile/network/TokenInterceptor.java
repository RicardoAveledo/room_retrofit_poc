package es.diusframi.orionlogisticsmobile.network;

import java.io.IOException;

import es.diusframi.orionlogisticsmobile.utilidades.Utilidades;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/**
 * Created by RicardoAveledo on 06/10/2020.
 */
public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        //rewrite the request to add bearer token
        Request newRequest=chain.request().newBuilder()
                .header("Authorization","Bearer "+ Utilidades.tokenAPI)
                .build();

        return chain.proceed(newRequest);
    }
}