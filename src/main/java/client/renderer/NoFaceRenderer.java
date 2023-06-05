package client.renderer;

import client.models.NoFaceModel;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.NoFace;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NoFaceRenderer extends MobRenderer<NoFace, NoFaceModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/entities/no_face.png");

    public NoFaceRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new NoFaceModel(ctx.bakeLayer(NoFaceModel.LAYER_LOCATION)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(NoFace entity) {return TEXTURE;}
}
