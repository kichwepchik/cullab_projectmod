package net.kichwepchik.projectmod.item;

import net.kichwepchik.projectmod.ProjectMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ProjectMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));


    public static final RegistryObject<Item> RAW_TITAN = ITEMS.register("raw_titan",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));



    public static final RegistryObject<Item> TITAN_INGOT = ITEMS.register("titan_ingot",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));











    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
