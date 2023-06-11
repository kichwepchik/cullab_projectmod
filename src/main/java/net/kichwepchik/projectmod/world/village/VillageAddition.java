//package net.kichwepchik.projectmod.world.village;
//
//import net.kichwepchik.projectmod.ProjectMod;
//import net.minecraft.core.Holder;
//import net.minecraft.core.Registry;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
//import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
//import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
//import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
//import net.minecraftforge.event.server.ServerAboutToStartEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import org.antlr.v4.runtime.misc.Pair;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID)
//public class villageAddition {
//    private static final ResourceKey<StructureProcessorList> EMPTY_PROCESSOR_LIST_KEY = ResourceKey.create(
//            Registry.PROCESSOR_LIST_REGISTRY, new ResourceLocation("minecraft", "empty"));
//
//    private static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry,
//                                          Registry<StructureProcessorList> processorListRegistry
//                                          ResourceLocation poolRL,
//                                          String nbtPieceRL,
//                                          int weight) {
//        Holder<StructureProcessorList> emptyProcessorList = processorListRegistry.getHolderOrThrow(EMPTY_PROCESSOR_LIST_KEY);
//        StructureTemplatePool pool = templatePoolRegistry.get(poolRL);
//        if (pool == null) return;
//        SinglePoolElement piece = SinglePoolElement.legacy(nbtPieceRL,
//                emptyProcessorList).apply(StructureTemplatePool.Projection.RIGID);
//        for (int i = 0; i < weight; i++) {
//            pool.templates.add(piece);
//        }
//
//        List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(pool.rawTemplates);
//        listOfPieceEntries.add(new Pair<>(piece, weight));
//        pool.rawTemplates = listOfPieceEntries;
//    }
//
//    @SubscribeEvent
//    public static void addNewVillageBuilding(final ServerAboutToStartEvent event) {
//        Registry<StructureTemplatePool> templatePoolRegistry = event.getServer().registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).orElseThrow();
//        Registry<StructureProcessorList> processorListRegistry = event.getServer().registryAccess().registry(Registry.PROCESSOR_LIST_REGISTRY).orElseThrow();
//
//
//        addBuildingToPool(templatePoolRegistry, processorListRegistry,
//                new ResourceLocation("minecraft:village/plains/houses"),
//                "projectmod:plains_seeker", 250);
//    }
//}
package net.kichwepchik.projectmod.world.village;

import com.mojang.datafixers.util.Pair;
import net.kichwepchik.projectmod.ProjectMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.SinglePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = ProjectMod.MOD_ID)
public class VillageAddition {
    private static final ResourceKey<StructureProcessorList> EMPTY_PROCESSOR_LIST_KEY = ResourceKey.create(
            Registry.PROCESSOR_LIST_REGISTRY, new ResourceLocation("minecraft", "empty"));


    private static void addBuildingToPool(Registry<StructureTemplatePool> templatePoolRegistry,
                                          Registry<StructureProcessorList> processorListRegistry,
                                          ResourceLocation poolRL,
                                          String nbtPieceRL,
                                          int weight) {


        Holder<StructureProcessorList> emptyProcessorList = processorListRegistry.getHolderOrThrow(EMPTY_PROCESSOR_LIST_KEY);


        StructureTemplatePool pool = templatePoolRegistry.get(poolRL);
        if (pool == null) return;


        SinglePoolElement piece = SinglePoolElement.legacy(nbtPieceRL,
                emptyProcessorList).apply(StructureTemplatePool.Projection.RIGID);


        for (int i = 0; i < weight; i++) {
            pool.templates.add(piece);
        }


        List<Pair<StructurePoolElement, Integer>> listOfPieceEntries = new ArrayList<>(pool.rawTemplates);
        listOfPieceEntries.add(new Pair<>(piece, weight));
        pool.rawTemplates = listOfPieceEntries;
    }


    @SubscribeEvent
    public static void addNewVillageBuilding(final ServerAboutToStartEvent event) {
        Registry<StructureTemplatePool> templatePoolRegistry = event.getServer().registryAccess().registry(Registry.TEMPLATE_POOL_REGISTRY).orElseThrow();
        Registry<StructureProcessorList> processorListRegistry = event.getServer().registryAccess().registry(Registry.PROCESSOR_LIST_REGISTRY).orElseThrow();

        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/plains/houses"),
                "projectmod:plains_little_house", 10);

        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/plains/houses"),
                "projectmod:plains_architect", 10);

        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/plains/houses"),
                "projectmod:plains_village_tree", 20);

        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/plains/houses"),
                "projectmod:plains_strawberry", 30);


        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/savanna/houses"),
                "projectmod:plains_hunter", 10);

        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/savanna/houses"),
                "projectmod:plains_seeker", 5);



        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/desert/houses"),
                "projectmod:plains_miner", 100);



        addBuildingToPool(templatePoolRegistry, processorListRegistry,
                new ResourceLocation("minecraft:village/snowy/houses"),
                "projectmod:plains_creator", 30);





    }


}