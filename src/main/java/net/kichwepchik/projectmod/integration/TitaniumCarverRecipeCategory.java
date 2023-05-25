package net.kichwepchik.projectmod.integration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.block.ModBlocks;
import net.kichwepchik.projectmod.recipe.TitaniumCarverRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class TitaniumCarverRecipeCategory implements IRecipeCategory<TitaniumCarverRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(ProjectMod.MOD_ID, "titanium_carver");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(ProjectMod.MOD_ID, "textures/gui/titanium_carver_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public TitaniumCarverRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.TITANIUM_CARVER.get()));
    }
    @Override
    public RecipeType<TitaniumCarverRecipe> getRecipeType() {
        return JEIProjectModPlugin.CARVER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Titanium Carver");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, TitaniumCarverRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 12, 15).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());

    }
}
