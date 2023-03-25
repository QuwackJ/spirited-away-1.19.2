package io.github.quwackj.spiritedawayghs.events;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.client.models.SootSpriteModel;
import io.github.quwackj.spiritedawayghs.client.render.SootSpriteRender;
import io.github.quwackj.spiritedawayghs.initializer.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpiritedAwayGHS.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.ENTITIES.get(), SootSpriteRender::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SootSpriteModel.LAYER_LOCATION, SootSpriteModel::createBodyLayer);
    }
}
