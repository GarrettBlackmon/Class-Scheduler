package com.garrettblackmon.classscheduler;

import android.content.Context;
import android.content.SharedPreferences;
/**
 * Created by garrett on 3/21/18.
 * Saves the state of the selected theme between app instances
 */

public class SharedPref {
    SharedPreferences mySharedPref;
    public SharedPref(Context context) {
        mySharedPref = context.getSharedPreferences("filename", Context.MODE_PRIVATE);
    }

    public void setDarkThemeState(Boolean state) {
        SharedPreferences.Editor editor = mySharedPref.edit();
        editor.putBoolean("DarkTheme", state);
        editor.commit();
    }

    public boolean loadDarkThemeState() {
        Boolean state = mySharedPref.getBoolean("DarkTheme", false);
        return state;
    }
}
