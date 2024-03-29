package net.kichwepchik.projectmod.entity;

import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.entity.custom.ChomperEntity;
import net.kichwepchik.projectmod.entity.custom.GhostOfNetherEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ProjectMod.MOD_ID);

    public static final RegistryObject<EntityType<ChomperEntity>> CHOMPER =
            ENTITY_TYPES.register("chomper",
                    ()-> EntityType.Builder.of(ChomperEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(ProjectMod.MOD_ID, "chomper").toString()));

    public static final RegistryObject<EntityType<GhostOfNetherEntity>> GHOST_OF_NETHER =
            ENTITY_TYPES.register("ghost_of_nether",
                    ()-> EntityType.Builder.of(GhostOfNetherEntity::new, MobCategory.MONSTER)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(ProjectMod.MOD_ID, "ghost_of_nether").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
