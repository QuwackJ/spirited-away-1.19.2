package io.github.quwackj.spiritedawayghs.client.render;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.client.models.SootSpriteModel;
import io.github.quwackj.spiritedawayghs.entities.SootSprite;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SootSpriteRender extends MobRenderer<SootSprite, SootSpriteModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "/spirited away/forge-1.19-41.1.0-mdk/src/main/java/io/github/quwackj/spiritedawayghs/client/models/SootSpriteModel.java");

    public SootSpriteRender(EntityRendererProvider.Context context) {
        super(context, new SootSpriteRender(context.render(SootSpriteModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SootSprite sootSprite) {
        return TEXTURE;
    }
}
