package ru.palankar.firstseedmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FirstSeed.MODID, name = FirstSeed.NAME, version = FirstSeed.VERSION)
public class FirstSeed {
    public static final String MODID = "fcm";
    public static final String NAME = "First Seed";
    public static final String VERSION = "0.0.1";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
