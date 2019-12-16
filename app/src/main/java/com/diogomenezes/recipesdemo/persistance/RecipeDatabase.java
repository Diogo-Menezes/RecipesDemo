package com.diogomenezes.recipesdemo.persistance;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.diogomenezes.recipesdemo.models.Recipe;

@Database(entities = {Recipe.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class RecipeDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "recipes_db";

    private static RecipeDatabase instance;

    public static RecipeDatabase getInstance(final Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context.getApplicationContext(),
                    RecipeDatabase.class,
                    DATABASE_NAME
            ).build();
        }
        return instance;
    }

    public abstract RecipeDao getRecipeDao();

}