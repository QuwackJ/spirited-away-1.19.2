package io.github.quwackj.spiritedawayghs.events;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.SootSprite;
import io.github.quwackj.spiritedawayghs.initializer.ModEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpiritedAwayGHS.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityEvents {
    // for adding attributes to entities
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SOOT_SPRITE.get(), SootSprite.getSootSpriteAttributes().build());
    }
}
