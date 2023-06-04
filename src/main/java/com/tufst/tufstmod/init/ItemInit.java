package com.tufst.tufstmod.init;
import net.minecraft.world.item.CreativeModeTab;
import com.tufst.tufstmod.TufstMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, TufstMod.MOD_ID);
        public static final RegistryObject<Item> ICEFRAGMENTS = ITEMS.register("ice_fragments",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUFSTITEMS_TAB)));
        public static final RegistryObject<Item> ICECOIN = ITEMS.register("ice_coin",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUFSTITEMS_TAB)));
        public static final RegistryObject<Item> REDBADDIESKIN = ITEMS.register("red_baddie_skin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUFSTITEMS_TAB)));
    public static final RegistryObject<Item> PURPLEBADDIESKIN = ITEMS.register("purple_baddie_skin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUFSTITEMS_TAB)));
    public static final RegistryObject<Item> YELLOWBADDIESKIN = ITEMS.register("yellow_baddie_skin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUFSTITEMS_TAB)));
    public static final RegistryObject<Item> BLACKBADDIESKIN = ITEMS.register("black_baddie_skin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUFSTITEMS_TAB)));
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}