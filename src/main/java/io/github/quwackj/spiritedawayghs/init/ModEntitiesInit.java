package io.github.quwackj.spiritedawayghs.init;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.entities.NoFace;
import io.github.quwackj.spiritedawayghs.entities.OtoriSama;
import io.github.quwackj.spiritedawayghs.entities.Soot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.security.DigestInputStream;

public class ModEntitiesInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<EntityType<Soot>> SOOT = ENTITIES.register("soot",
            () -> EntityType.Builder.of(Soot::new, MobCategory.CREATURE).build(SpiritedAwayGHS.MOD_ID + "soot"));

    public static final RegistryObject<EntityType<OtoriSama>> OTORISAMA = ENTITIES.register("otorisama",
            () -> EntityType.Builder.of(OtoriSama::new, MobCategory.CREATURE).build(SpiritedAwayGHS.MOD_ID + "otorisama"));

    public static final RegistryObject<EntityType<NoFace>> NOFACE = ENTITIES.register("noface",
            () -> EntityType.Builder.of(NoFace::new, MobCategory.CREATURE).build(SpiritedAwayGHS.MOD_ID + "noface"));
}
