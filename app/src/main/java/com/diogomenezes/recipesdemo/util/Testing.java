package com.diogomenezes.recipesdemo.util;

import android.util.Log;

import com.diogomenezes.recipesdemo.models.Recipe;

import java.util.List;

public class Testing {
    public static void printRecipes(List<Recipe> recipes, String tag) {
        for (Recipe recipe : recipes) {
            Log.d(tag, "printRecipes: " + recipe.getTitle());
        }
    }
}
