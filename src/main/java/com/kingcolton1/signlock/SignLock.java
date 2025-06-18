package com.kingcolton1.signlock;

import com.fox2code.foxloader.loader.Mod;
import com.fox2code.foxloader.utils.Enumerations;

public class SignLock extends Mod {
    public static String loggingPrefix = "[SignLock] ";

    @Override
    public void onPreInit() {
        System.out.println(loggingPrefix + "initializing...");
    }
}