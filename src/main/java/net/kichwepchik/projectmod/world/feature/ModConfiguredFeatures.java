package net.kichwepchik.projectmod.world.feature;

import com.google.common.base.Suppliers;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;


public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, ProjectMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_COLLUB_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_TITAN_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHER_TITAN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.NETHERRACK_TITAN_ORE.get().defaultBlockState())));




    public static final RegistryObject<ConfiguredFeature<?,?>> COLLUB_ORE = CONFIGURED_FEATURES.register("collub_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_COLLUB_ORES.get(), 7)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHER_TITAN_ORE = CONFIGURED_FEATURES.register("nether_titan_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHER_TITAN_ORES.get(), 9)));


    public static final RegistryObject<ConfiguredFeature<?,?>> MANGO =
            CONFIGURED_FEATURES.register("mango", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(ModBlocks.MANGO_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(ModBlocks.MANGO_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2))
                            .dirt(BlockStateProvider.simple(ModBlocks.FLOWER_EARTH_BLOCK.get())).build()));

    public static final RegistryObject<ConfiguredFeature<?,?>> MANGO_SPAWN =
            CONFIGURED_FEATURES.register("mango_spawn",
                    ()->new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                            new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                                    ModPlacedFeatures.MANGO_CHECKED.getHolder().get(),
                                    0.5f)),ModPlacedFeatures.MANGO_CHECKED.getHolder().get())));




    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
