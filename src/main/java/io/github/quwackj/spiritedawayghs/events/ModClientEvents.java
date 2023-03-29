package io.github.quwackj.spiritedawayghs.events;

import client.models.OtoriLeafModel;
import client.models.OtoriModel;
import client.models.SootModel;
import client.renderer.OtoriRenderer;
import client.renderer.SootRenderer;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import io.github.quwackj.spiritedawayghs.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpiritedAwayGHS.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityInit.SOOT.get(), SootRenderer::new);
        event.registerEntityRenderer(EntityInit.OTORISAMA.get(), OtoriRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SootModel.LAYER_LOCATION, SootModel::createBodyLayer);
        event.registerLayerDefinition(OtoriModel.LAYER_LOCATION, OtoriModel::createBodyLayer);
    }

}
