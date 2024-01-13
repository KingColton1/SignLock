package com.kingcolton1.signlock;

import com.fox2code.foxloader.loader.ServerMod;

public class SignLockServer extends SignLock implements ServerMod {
    @Override
    public void onInit() {
        ServerMod.getGameInstance().log(SignLock.loggingPrefix + "Initialized");
    }
}