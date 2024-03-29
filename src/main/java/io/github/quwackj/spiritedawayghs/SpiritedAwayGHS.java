package io.github.quwackj.spiritedawayghs;

import com.mojang.logging.LogUtils;
import io.github.quwackj.spiritedawayghs.block.ModBlocks;
import io.github.quwackj.spiritedawayghs.block.entity.ModBlockEntities;
import io.github.quwackj.spiritedawayghs.init.ModEntitiesInit;
import io.github.quwackj.spiritedawayghs.item.ModItems;
import io.github.quwackj.spiritedawayghs.recipe.ModRecipes;
import io.github.quwackj.spiritedawayghs.screen.ModMenuTypes;
import io.github.quwackj.spiritedawayghs.screen.SteamerScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SpiritedAwayGHS.MOD_ID)
public class SpiritedAwayGHS {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "spiritedawayghs";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpiritedAwayGHS() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModEntitiesInit.ENTITIES.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.STEAMER_MENU.get(), SteamerScreen::new);
        }
    }
}
