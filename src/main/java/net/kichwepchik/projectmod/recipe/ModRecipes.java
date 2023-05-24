package net.kichwepchik.projectmod.recipe;

import net.kichwepchik.projectmod.ProjectMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {

    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, ProjectMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<TitaniumCarverRecipe>> TITANIUM_CARVER_SERIALIZER =
            SERIALIZERS.register("titanium_carver", ()->TitaniumCarverRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
