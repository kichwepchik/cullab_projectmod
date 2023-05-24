package net.kichwepchik.projectmod.block;

import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.custom.JumpyBlock;
import net.kichwepchik.projectmod.block.custom.SapphireLampBlock;
import net.kichwepchik.projectmod.block.custom.StrawberryCropBlock;
import net.kichwepchik.projectmod.block.custom.TitaniumCarverBlock;
import net.kichwepchik.projectmod.item.ModCreativeModeTab;
import net.kichwepchik.projectmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectMod.MOD_ID);

    public  static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);

    public  static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(4,8)), ModCreativeModeTab.PROJECT_TAB);

    public  static final RegistryObject<Block> TITAN_BLOCK = registerBlock("titan_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> NETHERRACK_TITAN_ORE = registerBlock("netherrack_titan_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops(),
                    UniformInt.of(10,12)), ModCreativeModeTab.PROJECT_TAB);



    public  static final RegistryObject<Block> DEEPSLATE_TITAN_ORE = registerBlock("deepslate_titan_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f).requiresCorrectToolForDrops(),
                    UniformInt.of(10,12)), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            ()-> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> SAPPHIRE_LAMP = registerBlock("sapphire_lamp",
            ()-> new SapphireLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(SapphireLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop",
            ()-> new StrawberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    public  static final RegistryObject<Block> TITANIUM_CARVER = registerBlock("titanium_carver",
            ()-> new TitaniumCarverBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.PROJECT_TAB);





    private static <T extends Block>RegistryObject<T>registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn,tab);

        return toReturn;
    }

    private static <T extends  Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                             CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new  Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
