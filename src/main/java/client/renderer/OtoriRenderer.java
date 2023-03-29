package client.renderer;

import client.models.OtoriLeafModel;
import client.models.OtoriModel;
import client.models.OtoriTowelModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.VertexFormat;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.Model;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class OtoriRenderer extends MobRenderer<OtoriSama, OtoriModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/entities/otori_leaf.png");
    private static final ResourceLocation WATER_TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/entities/otori_towel.png");
    private static final OtoriModel LEAF_MODEL = new OtoriLeafModel(OtoriLeafModel.createBodyLayer().bakeRoot());
    private static final OtoriModel TOWEL_MODEL = new OtoriTowelModel(OtoriTowelModel.createBodyLayer().bakeRoot());
    private OtoriModel leaf = LEAF_MODEL;
    private OtoriModel water;

    public OtoriRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new OtoriLeafModel(OtoriLeafModel.createBodyLayer().bakeRoot()), 0.5f);
        this.water = new OtoriTowelModel(OtoriTowelModel.createBodyLayer().bakeRoot());
    }

    @Override
    public ResourceLocation getTextureLocation(OtoriSama entity) { return entity.isInWater() ? WATER_TEXTURE : TEXTURE; }

   @Override
    public void render(OtoriSama entity, float entityYaw, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int packedLight) {
        if (entity.isInWater()) {
            this.model = this.water;
        } else {
            this.model = this.leaf;
        }

        super.render(entity, entityYaw, partialTicks, matrixStack, buffer, packedLight);
    }
}
