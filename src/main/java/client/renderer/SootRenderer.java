package client.renderer;

import client.models.SootModel;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.Soot;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SootRenderer extends MobRenderer<Soot, SootModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/entities/soot.png");

    public SootRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SootModel(ctx.bakeLayer(SootModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Soot entity) {
        return TEXTURE;
    }
}
