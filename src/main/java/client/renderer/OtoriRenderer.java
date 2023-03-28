package client.renderer;

import client.models.OtoriLeafModel;
import client.models.OtoriModel;
import client.models.SootModel;
import com.mojang.blaze3d.vertex.PoseStack;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OtoriRenderer extends MobRenderer<OtoriSama, OtoriModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/entities/otori_leaf.png");
    private static final ResourceLocation WATER_TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/entities/otori_towel.png");
    private static final OtoriModel MODEL = new OtoriLeafModel(OtoriLeafModel.createBodyLayer().bakeRoot());
    //private static final OtoriTowelModel WATER_MODEL = new OtoriTowelModel(OtoriTowelModel.createBodyLayer().bakeRoot());

    public OtoriRenderer(EntityRendererProvider.Context ctx) {
        super(ctx, MODEL, 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(OtoriSama entity) {
        return entity.isInWater() ? WATER_TEXTURE : TEXTURE;
    }

    /*@Override
    public OtoriLeafModel getModel(OtoriSama entity) {
        return entity.isInWater() ? WATER_MODEL : MODEL;
    }*/
}
