package net.kichwepchik.projectmod.block.custom;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;

public class ModSaplingBlock extends SaplingBlock {
    private Supplier<Block> otherDirt;

    public ModSaplingBlock(AbstractTreeGrower pTreeGrower, Properties pProperties, Supplier<Block> otherDirt) {
        super(pTreeGrower, pProperties);
        this.otherDirt = otherDirt;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(otherDirt.get());
    }
}
