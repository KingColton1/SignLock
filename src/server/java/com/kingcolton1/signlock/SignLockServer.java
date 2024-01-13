package com.kingcolton1.signlock;

import com.fox2code.foxloader.loader.ServerMod;
import com.fox2code.foxloader.network.NetworkPlayer;
import com.fox2code.foxloader.registry.CommandCompat;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SignLockServer extends SignLock implements ServerMod {
    @Override
    public void onInit() {
        ServerMod.getGameInstance().log(SignLock.loggingPrefix + "Initialized");
    }
}