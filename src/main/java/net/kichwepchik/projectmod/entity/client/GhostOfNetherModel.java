package net.kichwepchik.projectmod.entity.client;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.entity.custom.GhostOfNetherEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;


public class GhostOfNetherModel extends AnimatedGeoModel <GhostOfNetherEntity> {
    @Override
    public ResourceLocation getModelResource(GhostOfNetherEntity object) {
            return new ResourceLocation(ProjectMod.MOD_ID, "geo/ghost_of_nether.geo.json");
            }

    @Override
    public ResourceLocation getTextureResource(GhostOfNetherEntity object) {
            return new ResourceLocation(ProjectMod.MOD_ID, "textures/entity/ghost_of_nether_texture.png");
            }

    @Override
    public ResourceLocation getAnimationResource(GhostOfNetherEntity animatable) {
            return new ResourceLocation(ProjectMod.MOD_ID, "animations/ghost_of_nether.animation.json");
            }
}
