package io.github.quwackj.spiritedawayghs.integration;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.block.ModBlocks;
import io.github.quwackj.spiritedawayghs.recipe.SteamerRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SteamerRecipeCategory implements IRecipeCategory<SteamerRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "steaming");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/gui/steamer_jei.png");

    private final IDrawable background;
    private final IDrawable icon;

    public SteamerRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 82);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.STEAMER.get()));
    }

    @Override
    public RecipeType<SteamerRecipe> getRecipeType() {
        return JEISpiritedAwayModPlugin.STEAM_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Steamer");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, SteamerRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 56, 17).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 35).addItemStack(recipe.getResultItem());
    }
}
