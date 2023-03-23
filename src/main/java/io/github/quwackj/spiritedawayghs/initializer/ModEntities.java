package io.github.quwackj.spiritedawayghs.initializer;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.DustBinCreature;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<EntityType<DustBinCreature>> MOD_ENTITY = ENTITIES.register("Dust Bin Creature",
            () -> EntityType.Builder.of(DustBinCreature::new, MobCategory.CREATURE).build("Dust Bin Creature"));
}
