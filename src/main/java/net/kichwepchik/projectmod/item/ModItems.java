package net.kichwepchik.projectmod.item;

import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.kichwepchik.projectmod.entity.ModEntityTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
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

    public static final RegistryObject<Item> SOUL_OF_GHOST = ITEMS.register("soul_of_ghost",
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

    public static final  RegistryObject<Item> TITAN_UPGRADE_SWORD = ITEMS.register("titan_upgrade_sword",
            ()-> new SwordItem(ModTiers.TITAN_UPGRADE,2,5f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_PICKAXE = ITEMS.register("titan_upgrade_pickaxe",
            ()-> new PickaxeItem(ModTiers.TITAN_UPGRADE,2,5f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_SHOVEL = ITEMS.register("titan_upgrade_shovel",
            ()-> new ShovelItem(ModTiers.TITAN_UPGRADE,2,5f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_AXE = ITEMS.register("titan_upgrade_axe",
            ()-> new AxeItem(ModTiers.TITAN_UPGRADE,2,5f,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_HOE = ITEMS.register("titan_upgrade_hoe",
            ()-> new HoeItem(ModTiers.TITAN_UPGRADE,2,5f,
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

    public static final  RegistryObject<Item> TITAN_UPGRADE_HELMET = ITEMS.register("titan_upgrade_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TITAN_UPGRADE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_CHESTPLATE = ITEMS.register("titan_upgrade_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TITAN_UPGRADE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_LEGGING = ITEMS.register("titan_upgrade_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TITAN_UPGRADE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));
    public static final  RegistryObject<Item> TITAN_UPGRADE_BOOTS = ITEMS.register("titan_upgrade_boots",
            ()-> new ArmorItem(ModArmorMaterials.TITAN_UPGRADE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));


    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            ()-> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(),
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));

    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static final RegistryObject<Item> STRAWBERRY_PIE = ITEMS.register("strawberry_pie",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.6f)
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 3),1f).build())));


    public static final RegistryObject<Item> CHOMPER_SPAWN_EGG = ITEMS.register("chomper_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntityTypes.CHOMPER, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));


    public static final RegistryObject<Item> GHOST_OF_NETHER_SPAWN_EGG = ITEMS.register("ghost_of_nether_spawn_egg",
            ()-> new ForgeSpawnEggItem(ModEntityTypes.GHOST_OF_NETHER, 0x090909, 0x16badb,
                    new Item.Properties().tab(ModCreativeModeTab.PROJECT_TAB)));













    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
