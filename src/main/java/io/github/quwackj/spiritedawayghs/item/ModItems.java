package io.github.quwackj.spiritedawayghs.item;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.init.ModEntitiesInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> SOOT_SPAWN_EGG = ITEMS.register("soot_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.SOOT, 0x02070B, 0x071333, new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> GREEN_KONPEITO = ITEMS.register("green_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static final RegistryObject<Item> RED_KONPEITO = ITEMS.register("red_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static final RegistryObject<Item> WHITE_KONPEITO = ITEMS.register("white_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static final RegistryObject<Item> YELLOW_KONPEITO = ITEMS.register("yellow_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
