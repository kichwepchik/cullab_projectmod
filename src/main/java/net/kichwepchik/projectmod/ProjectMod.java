package net.kichwepchik.projectmod;

import com.mojang.logging.LogUtils;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.kichwepchik.projectmod.block.entity.ModBlockEntities;
import net.kichwepchik.projectmod.entity.ModEntityTypes;
import net.kichwepchik.projectmod.entity.client.ChomperRenderer;
import net.kichwepchik.projectmod.entity.client.GhostOfNetherRenderer;
import net.kichwepchik.projectmod.item.ModItems;
import net.kichwepchik.projectmod.networking.ModMessages;
import net.kichwepchik.projectmod.painting.ModPaintings;
import net.kichwepchik.projectmod.recipe.ModRecipes;
import net.kichwepchik.projectmod.screen.ModMenuTypes;
import net.kichwepchik.projectmod.screen.TitaniumCarverScreen;
import net.kichwepchik.projectmod.villager.ModVillagers;
import net.kichwepchik.projectmod.world.feature.ModConfiguredFeatures;
import net.kichwepchik.projectmod.world.feature.ModPlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ProjectMod.MOD_ID)
public class ProjectMod
{
    public static final String MOD_ID = "projectmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ProjectMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);
        ModPaintings.register(modEventBus);
        GeckoLib.initialize();
        ModEntityTypes.register(modEventBus);
        ModVillagers.register(modEventBus);
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.registry(modEventBus);


        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(()->{
            SpawnPlacements.register(ModEntityTypes.GHOST_OF_NETHER.get(),
                    SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                    Monster::checkMonsterSpawnRules);
           ModVillagers.registerPOIs();
        });

        ModMessages.register();
    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRAWBERRY_CROP.get(), RenderType.cutout());

            MenuScreens.register(ModMenuTypes.TITANIUM_CARVER_MENU.get(), TitaniumCarverScreen::new);
            EntityRenderers.register(ModEntityTypes.CHOMPER.get(), ChomperRenderer::new);

            EntityRenderers.register(ModEntityTypes.GHOST_OF_NETHER.get(), GhostOfNetherRenderer::new);

        }
    }
}
