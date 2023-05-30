package net.kichwepchik.projectmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.kichwepchik.projectmod.ProjectMod;
import net.kichwepchik.projectmod.entity.custom.ChomperEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChomperRenderer extends GeoEntityRenderer<ChomperEntity> {
    public ChomperRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChomperModel());
        this.shadowRadius = 0.3f;

    }

    @Override
    public ResourceLocation getTextureLocation(ChomperEntity instance) {
        return new ResourceLocation(ProjectMod.MOD_ID, "textures/entity/chomper_texture.png");
    }

    @Override
    public RenderType getRenderType(ChomperEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
