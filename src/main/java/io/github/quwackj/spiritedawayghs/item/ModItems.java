package io.github.quwackj.spiritedawayghs.item;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.event.InputEvent;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<Item> GREEN_KONPEITO = ITEMS.register("green_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static final RegistryObject<Item> RED_KONPEITO = ITEMS.register("red_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
