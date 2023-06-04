package com.tufst.tufstmod;

// imports up here //

import com.tufst.tufstmod.init.BlockInit;
import com.tufst.tufstmod.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TufstMod.MOD_ID)
public class TufstMod {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tufstmod";

    public TufstMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::setup);

        ItemInit.ITEMS.register(modEventBus);

        BlockInit.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
}