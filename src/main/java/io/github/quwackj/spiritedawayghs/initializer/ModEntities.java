package io.github.quwackj.spiritedawayghs.initializer;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import io.github.quwackj.spiritedawayghs.entities.SootSprite;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<EntityType<SootSprite>> SOOT_SPRITE = ENTITIES.register("Soot Sprite",
            () -> EntityType.Builder.of(SootSprite::new, MobCategory.CREATURE).build("Soot Sprite"));

    public static final RegistryObject<EntityType<OtoriSama>> OTORI_SAMA = ENTITIES.register("Otori-Sama",
            () -> EntityType.Builder.of(OtoriSama::new, MobCategory.CREATURE).build("Otori-Sama"));
}
