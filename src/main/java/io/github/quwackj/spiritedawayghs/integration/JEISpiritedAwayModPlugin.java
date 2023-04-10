package io.github.quwackj.spiritedawayghs.integration;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.recipe.SteamerRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEISpiritedAwayModPlugin implements IModPlugin {
    public static RecipeType<SteamerRecipe> STEAM_TYPE =
            new RecipeType<> (SteamerRecipeCategory.UID, SteamerRecipe.class);


    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(SpiritedAwayGHS.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                SteamerRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<SteamerRecipe> recipesInfusing = rm.getAllRecipesFor(SteamerRecipe.Type.INSTANCE);
        registration.addRecipes(STEAM_TYPE, recipesInfusing);
    }
}
