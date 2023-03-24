package io.github.quwackj.spiritedawayghs.initializer;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.DustBunny;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<EntityType<DustBunny>> MOD_ENTITY = ENTITIES.register("Dust Bunny",
            () -> EntityType.Builder.of(DustBunny::new, MobCategory.CREATURE).build("Dust Bunny"));
}
