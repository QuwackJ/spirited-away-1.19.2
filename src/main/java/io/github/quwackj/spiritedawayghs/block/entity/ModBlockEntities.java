package io.github.quwackj.spiritedawayghs.block.entity;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<BlockEntityType<SteamerBlockEntity>> STEAMER = BLOCK_ENTITIES.register("steamer",
            () -> BlockEntityType.Builder.of(SteamerBlockEntity::new, ModBlocks.STEAMER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
