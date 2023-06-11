package net.kichwepchik.projectmod.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.recipe.TitaniumCarverRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;


import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIProjectModPlugin implements IModPlugin {
    public static RecipeType<TitaniumCarverRecipe> TITANIUM_CARVER_TYPE =
            new RecipeType<>(TitaniumCarverRecipeCategory.UID, TitaniumCarverRecipe.class);


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ProjectMod.MOD_ID, "jei_plugin");
    }
    @Override
    public void registerCategories(IRecipeCategoryRegistration registration){
        registration.addRecipeCategories(new TitaniumCarverRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration){
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<TitaniumCarverRecipe> recipesCarver = rm.getAllRecipesFor(TitaniumCarverRecipe.Type.INSTANCE);
        registration.addRecipes(TITANIUM_CARVER_TYPE, recipesCarver);
    }

}
