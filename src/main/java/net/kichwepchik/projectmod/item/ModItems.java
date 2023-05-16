package net.kichwepchik.projectmod.item;

import net.kichwepchik.projectmod.ProjectMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
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


    public static final RegistryObject<Item> GHOST_HEART = ITEMS.register("ghost_heart",
            ()->new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));


    public static final RegistryObject<Item> PIECE_OF_SOUL = ITEMS.register("piece_of_soul",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));




    public static final  RegistryObject<Item> TITAN_SWORD = ITEMS.register("titan_sword",
            ()-> new SwordItem(ModTiers.TITAN,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_PICKAXE = ITEMS.register("titan_pickaxe",
            ()-> new PickaxeItem(ModTiers.TITAN,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_SHOVEL = ITEMS.register("titan_shovel",
            ()-> new ShovelItem(ModTiers.TITAN,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_AXE = ITEMS.register("titan_axe",
            ()-> new AxeItem(ModTiers.TITAN,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_HOE = ITEMS.register("titan_hoe",
            ()-> new HoeItem(ModTiers.TITAN,2,3f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));


    public static final  RegistryObject<Item> TITAN_HELMET = ITEMS.register("titan_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TITAN, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
 public static final  RegistryObject<Item> TITAN_CHESTPLATE = ITEMS.register("titan_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TITAN, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
 public static final  RegistryObject<Item> TITAN_LEGGING = ITEMS.register("titan_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TITAN, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
 public static final  RegistryObject<Item> TITAN_BOOTS = ITEMS.register("titan_boots",
            ()-> new ArmorItem(ModArmorMaterials.TITAN, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));












    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
