package net.kichwepchik.projectmod.block.entity;

import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>>BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ProjectMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<TitaniumCarverBlockEntity>> TITANIUM_CARVER =
            BLOCK_ENTITIES.register("titanium_carver",()->
                    BlockEntityType.Builder.of(TitaniumCarverBlockEntity::new,
                            ModBlocks.TITANIUM_CARVER.get()).build(null));


    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
