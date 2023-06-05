package io.github.quwackj.spiritedawayghs.events;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.NoFace;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import io.github.quwackj.spiritedawayghs.entities.Soot;
import io.github.quwackj.spiritedawayghs.init.ModEntitiesInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpiritedAwayGHS.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntitiesInit.SOOT.get(), Soot.getSootAttributes().build());
        event.put(ModEntitiesInit.OTORISAMA.get(), OtoriSama.getOtoriAttributes().build());
        event.put(ModEntitiesInit.NOFACE.get(), NoFace.getNoFaceAttributes().build());
    }

}
