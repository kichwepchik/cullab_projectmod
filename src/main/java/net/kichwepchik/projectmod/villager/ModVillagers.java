package net.kichwepchik.projectmod.villager;

import com.google.common.collect.ImmutableSet;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, ProjectMod.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, ProjectMod.MOD_ID);





    public static final RegistryObject<PoiType> TITANIUM_CARVER_POI = POI_TYPES.register("titanium_carver_poi",
            ()-> new PoiType(ImmutableSet.copyOf(ModBlocks.TITANIUM_CARVER.get().getStateDefinition().getPossibleStates()),
                    1,1));
    public static final RegistryObject<PoiType> CRAFTING_TABLE_POI = POI_TYPES.register("crafting_table_poi",
            ()-> new PoiType(ImmutableSet.copyOf(Blocks.CRAFTING_TABLE.getStateDefinition().getPossibleStates()),
                    1,2));
    public static final RegistryObject<PoiType> SCOUT_DESK_POI = POI_TYPES.register("scout_desk_poi",
            ()-> new PoiType(ImmutableSet.copyOf(ModBlocks.SCOUT_DESK.get().getStateDefinition().getPossibleStates()),
                    1,1));
    public static final RegistryObject<PoiType> ANVIL_POI = POI_TYPES.register("anvil_poi",
            ()-> new PoiType(ImmutableSet.copyOf(Blocks.ANVIL.getStateDefinition().getPossibleStates()),
                    1,1));
    public static final RegistryObject<PoiType> NOTE_BLOCK_POI = POI_TYPES.register("note_block_poi",
            ()-> new PoiType(ImmutableSet.copyOf(Blocks.NOTE_BLOCK.getStateDefinition().getPossibleStates()),
                    1,1));





    public static final RegistryObject<VillagerProfession> CREATOR = VILLAGER_PROFESSIONS.register("creator",
            ()-> new VillagerProfession("creator", x ->x.get() == TITANIUM_CARVER_POI.get(),
                    x -> x.get() == TITANIUM_CARVER_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_ARMORER));

    public static final RegistryObject<VillagerProfession> MINER = VILLAGER_PROFESSIONS.register("miner",
            ()-> new VillagerProfession("miner", x ->x.get() == CRAFTING_TABLE_POI.get(),
                    x -> x.get() == CRAFTING_TABLE_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_BUTCHER));

    public static final RegistryObject<VillagerProfession> SEEKER = VILLAGER_PROFESSIONS.register("seeker",
            ()-> new VillagerProfession("seeker", x ->x.get() == SCOUT_DESK_POI.get(),
                    x -> x.get() == SCOUT_DESK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_BUTCHER));

    public static final RegistryObject<VillagerProfession> HUNTER = VILLAGER_PROFESSIONS.register("hunter",
            ()-> new VillagerProfession("hunter", x ->x.get() == ANVIL_POI.get(),
                    x -> x.get() == ANVIL_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_BUTCHER));
    public static final RegistryObject<VillagerProfession> ARCHITECT = VILLAGER_PROFESSIONS.register("architect",
            ()-> new VillagerProfession("architect", x ->x.get() == NOTE_BLOCK_POI.get(),
                    x -> x.get() == NOTE_BLOCK_POI.get(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_BUTCHER));







    public static void registerPOIs(){
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, TITANIUM_CARVER_POI.get ());
        } catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, CRAFTING_TABLE_POI.get ());
        } catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, SCOUT_DESK_POI.get ());
        } catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, ANVIL_POI.get ());
        } catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class,
                    "registerBlockStates", PoiType.class).invoke(null, NOTE_BLOCK_POI.get ());
        } catch (InvocationTargetException | IllegalAccessException exception){
            exception.printStackTrace();
        }


    }


    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
