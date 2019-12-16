package com.diogomenezes.recipesdemo.network;

import androidx.lifecycle.LiveData;

import com.diogomenezes.recipesdemo.network.responses.ApiResponse;
import com.diogomenezes.recipesdemo.network.responses.RecipeResponse;
import com.diogomenezes.recipesdemo.network.responses.RecipeSearchResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeApi {

    // SEARCH
    @GET("search")
    LiveData<ApiResponse<RecipeSearchResponse>> searchRecipe(
            @Query("key") String key,
            @Query("q") String query,
            @Query("page") String page
    );

    // GET RECIPE REQUEST
    @GET("get")
    LiveData<ApiResponse<RecipeResponse>> getRecipe(
            @Query("key") String key,
            @Query("rId") String recipe_id
    );
}
