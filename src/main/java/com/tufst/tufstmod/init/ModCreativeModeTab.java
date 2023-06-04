package com.tufst.tufstmod.init;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TUFSTITEMS_TAB = new CreativeModeTab("tufstitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.ICEFRAGMENTS.get());
        }
    };
    public static final CreativeModeTab TUFSTBLOCKS_TAB = new CreativeModeTab("tufstblocktab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.ICE_ORE.get());
        }
    };
}