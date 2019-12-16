package com.diogomenezes.recipesdemo.util;

import java.util.concurrent.TimeUnit;

public class Constants {
    //PREFERENCES
    public static final String PREFERENCES = "com.diogomenezes.foodrecipesdemo.preferences";
    public static final String API_SELECTED = "api_selected";
    public static final String MEAL_DB_API = "meal_db_api";
    public static final String EDAMAM_DB_API = "edamam_db_api";

    //ACTIVITIES
    public static final String RECIPE_SELECTED = "recipe_selected";

    //NETWORK
    public static final String API_KEY = "";
    public static final String BASE_URL1="https://recipesapi.herokuapp.com/api/";
//    public static final String BASE_URL = "https://www.themealdb.com/";
//    public static final String EDAM_BASE_URL = "https://api.edamam.com/";

    //TIMEOUT
    public static final int NETWORK_TIMEOUT = 3000;
    public static final int CONNECTION_TIMEOUT = 10; //seconds
    public static final int READ_TIMEOUT = 10; // seconds
    public static final int WRITE_TIMEOUT = 10; // seconds
    public static final int RECIPE_REFRESH_TIME = (int) TimeUnit.DAYS.toMillis(30); //1M

//    public static final String APP_ID = "6a0e4de7";
//    public static final String APP_KEY = "da2bbd6128b841da8e9e54769babd139";


    //CATEGORIES
    public static final String[] DEFAULT_SEARCH_CATEGORIES =
            {"Steak", "Breakfast", "Chicken", "Beef", "Brunch", "Dinner", "Wine", "Italian","Vegan"};

    public static final String[] DEFAULT_SEARCH_CATEGORY_IMAGES =
            {"steak", "breakfast", "chicken", "beef", "brunch", "dinner", "wine", "italian","vegan"};

}
