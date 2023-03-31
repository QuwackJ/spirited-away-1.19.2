package io.github.quwackj.spiritedawayghs.item;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.FoodOnAStickItem;
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
            () -> new ForgeSpawnEggItem(ModEntitiesInit.SOOT, 0x02070B, 0x071333, new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static final RegistryObject<ForgeSpawnEggItem> OTORI_SPAWN_EGG = ITEMS.register("otori_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntitiesInit.OTORISAMA, 0xebd77f, 0x7be660, new Item.Properties().stacksTo(64).tab(ModCreativeModeTab.TAB_SPIRITEDAWAY)));

    public static final RegistryObject<Item> GREEN_KONPEITO = ITEMS.register("green_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY).food(Foods.GREEN_KONPEITO)));

    public static final RegistryObject<Item> RED_KONPEITO = ITEMS.register("red_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY).food(Foods.RED_KONPEITO)));

    public static final RegistryObject<Item> WHITE_KONPEITO = ITEMS.register("white_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY).food(Foods.WHITE_KONPEITO)));

    public static final RegistryObject<Item> YELLOW_KONPEITO = ITEMS.register("yellow_konpeito",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB_SPIRITEDAWAY).food(Foods.YELLOW_KONPEITO)));

    public static class Foods {
        public static final FoodProperties GREEN_KONPEITO = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.JUMP, 300, 1), 1)
                .build();

        public static final FoodProperties RED_KONPEITO = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300), 1)
                .build();

        public static final FoodProperties WHITE_KONPEITO = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 1)
                .build();

        public static final FoodProperties YELLOW_KONPEITO = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.6f)
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300), 1)
                .build();
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
