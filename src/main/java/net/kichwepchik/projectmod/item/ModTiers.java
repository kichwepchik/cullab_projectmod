package net.kichwepchik.projectmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier TITAN = new ForgeTier(4,2500,11f,
            2f,22, BlockTags.NEEDS_DIAMOND_TOOL,
            ()-> Ingredient.of(ModItems.TITAN_INGOT.get()));

    public static final ForgeTier TITAN_UPGRADE = new ForgeTier(4,5000,15f,4f,22,
            BlockTags.NEEDS_DIAMOND_TOOL,()->Ingredient.of(ModItems.TITAN_INGOT.get()));
    
}
