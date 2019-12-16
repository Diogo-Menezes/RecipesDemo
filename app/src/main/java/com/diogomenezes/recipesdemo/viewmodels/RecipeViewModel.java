package com.diogomenezes.recipesdemo.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.diogomenezes.recipesdemo.models.Recipe;
import com.diogomenezes.recipesdemo.repositories.RecipeRepository;
import com.diogomenezes.recipesdemo.util.Resource;

public class RecipeViewModel extends AndroidViewModel {

    private RecipeRepository mRecipeRepository;
    private String mRecipeId;
    private boolean mDidRetrieveRecipe;

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        mRecipeRepository = RecipeRepository.getInstance(application);
    }

    public LiveData<Resource<Recipe>> searchRecipeApi(String mRecipeId) {
        return mRecipeRepository.searchRecipesApi(mRecipeId);
    }

//    public void searchRecipeById(String recipeId) {
//        mRecipeId = recipeId;
//        mRecipeRepository.searchRecipe(recipeId);
//    }
//
//    public String getRecipeId() {
//        return mRecipeId;
//    }
//
//    public LiveData<Boolean> isRecipeRequestTimedOut() {
//        return mRecipeRepository.isRecipeRequestTimedOut();
//    }
//
//    public void setDidRetrieveRecipe(boolean retrieveRecipe) {
//        this.mDidRetrieveRecipe = mDidRetrieveRecipe;
//    }
//
//    public boolean didRetrieveRecipe() {
//        return mDidRetrieveRecipe;
//    }

}
