package net.kichwepchik.projectmod;

import com.mojang.logging.LogUtils;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.kichwepchik.projectmod.block.entity.ModBlockEntities;
import net.kichwepchik.projectmod.entity.ModEntityTypes;
import net.kichwepchik.projectmod.item.ModItems;
import net.kichwepchik.projectmod.networking.ModMessages;
import net.kichwepchik.projectmod.recipe.ModRecipes;
import net.kichwepchik.projectmod.screen.ModMenuTypes;
import net.kichwepchik.projectmod.screen.TitaniumCarverScreen;
import net.kichwepchik.projectmod.villager.ModVillagers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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

        GeckoLib.initialize();
        ModEntityTypes.register(modEventBus);
        ModVillagers.register(modEventBus);


        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(()->{
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
        }
    }
}
