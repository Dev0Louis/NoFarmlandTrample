package dev.louis.nofarmlandtrample;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class NoFarmlandTrample implements ModInitializer {
    Logger LOOGER = Logger.getLogger("NoFarmlandTrample");
    @Override
    public void onInitialize() {
        LOOGER.info("NoFarmlandTrample Initialized!");
    }
}
