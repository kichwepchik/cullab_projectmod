package net.kichwepchik.projectmod.block;

import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.custom.*;
import net.kichwepchik.projectmod.item.ModCreativeModeTab;
import net.kichwepchik.projectmod.item.ModItems;
import net.kichwepchik.projectmod.world.feature.tree.MangoTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
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

    public  static final RegistryObject<Block> SCOUT_DESK = registerBlock("scout_desk",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> NETHERRACK_TITAN_ORE = registerBlock("netherrack_titan_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops(),
                    UniformInt.of(10,12)), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> DEEPSLATE_TITAN_ORE = registerBlock("deepslate_titan_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f).requiresCorrectToolForDrops(),
                    UniformInt.of(10,12)), ModCreativeModeTab.PROJECT_TAB);

    public  static final RegistryObject<Block> FLOWER_EARTH_BLOCK = registerBlock("flower_earth_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.GRASS).sound(SoundType.GRASS)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
            ()-> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> IMPETUOSITY_BLOCK = registerBlock("impetuosity_block",
            ()-> new ImpetuosityBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> REGENERATION_BLOCK = registerBlock("regeneration_block",
            ()-> new RegenerationBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> POWER_BLOCK = registerBlock("power_block",
            ()-> new PowerBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> MINING_BLOCK = registerBlock("mining_block",
            ()-> new MiningBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> FACETED_SAPPHIRE = registerBlock("faceted_sapphire",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> INACTIVE_EFFECT_BLOCK = registerBlock("inactive_effect_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> SAPPHIRE_LAMP = registerBlock("sapphire_lamp",
            ()-> new SapphireLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops().lightLevel(state -> state.getValue(SapphireLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.PROJECT_TAB);


    public  static final RegistryObject<Block> STRAWBERRY_CROP = BLOCKS.register("strawberry_crop",
            ()-> new StrawberryCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    public  static final RegistryObject<Block> TITANIUM_CARVER = registerBlock("titanium_carver",
            ()-> new TitaniumCarverBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.PROJECT_TAB);



    public  static final RegistryObject<Block> MANGO_LOG = registerBlock("mango_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> MANGO_WOOD = registerBlock("mango_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> STRIPPED_MANGO_LOG = registerBlock("stripped_mango_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> STRIPPED_MANGO_WOOD = registerBlock("stripped_mango_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> MANGO_LEAVES = registerBlock("mango_leaves",
            ()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.4f)
                    .requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            }, ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> MANGO_PLANKS = registerBlock("mango_planks",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .requiresCorrectToolForDrops()){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            }, ModCreativeModeTab.PROJECT_TAB);
    public  static final RegistryObject<Block> MANGO_SAPLING = registerBlock("mango_sapling",
            ()-> new ModSaplingBlock(new MangoTreeGrower(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING),
                    ()->ModBlocks.FLOWER_EARTH_BLOCK.get()),ModCreativeModeTab.PROJECT_TAB);






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
