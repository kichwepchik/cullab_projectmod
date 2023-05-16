package net.kichwepchik.projectmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PROJECT_TAB = new CreativeModeTab("projectmod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SAPPHIRE.get());
        }
    };
}
