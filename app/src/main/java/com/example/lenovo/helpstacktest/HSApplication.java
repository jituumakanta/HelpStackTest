package com.example.lenovo.helpstacktest;

import android.app.Application;

import com.tenmiles.helpstack.HSHelpStack;
import com.tenmiles.helpstack.gears.HSEmailGear;

/**
 * Created by Lenovo on 07-11-2017.
 */

public class HSApplication extends Application {
    HSHelpStack helpStack;

    @Override
    public void onCreate() {
        super.onCreate();

        helpStack = HSHelpStack.getInstance(this); // Get the HSHelpStack instance

        HSEmailGear emailGear = new HSEmailGear("jitu.umakanta@gmail.com", R.xml.articles);

        helpStack.setGear(emailGear);
    }
}
