package io.github.quwackj.spiritedawayghs.recipe;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SteamerRecipe>> STEAMING_SERIALIZER =
            SERIALIZERS.register("steaming", () -> SteamerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
