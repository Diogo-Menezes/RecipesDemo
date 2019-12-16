package com.diogomenezes.recipesdemo.network;

import com.diogomenezes.recipesdemo.util.LiveDataCallAdapterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.diogomenezes.recipesdemo.util.Constants.BASE_URL1;
import static com.diogomenezes.recipesdemo.util.Constants.CONNECTION_TIMEOUT;
import static com.diogomenezes.recipesdemo.util.Constants.READ_TIMEOUT;
import static com.diogomenezes.recipesdemo.util.Constants.WRITE_TIMEOUT;


public class ServiceGenerator {
    private static OkHttpClient client = new OkHttpClient.Builder()
            //establish connection to server
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            //time between each byte read from the server
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            //Time between each byte sent to server
            .writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS)
            .retryOnConnectionFailure(false)
            .build();

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl(BASE_URL1)
            .client(client)
            .addCallAdapterFactory(new LiveDataCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static RecipeApi recipeApi = retrofit.create(RecipeApi.class);

    public static RecipeApi getRecipeApi() {
        return recipeApi;
    }
}
