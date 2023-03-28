package io.github.quwackj.spiritedawayghs.events;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import io.github.quwackj.spiritedawayghs.entities.Soot;
import io.github.quwackj.spiritedawayghs.init.EntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpiritedAwayGHS.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.SOOT.get(), Soot.getSootAttributes().build());
        event.put(EntityInit.OTORISAMA.get(), OtoriSama.getOtoriAttributes().build());
    }
}
