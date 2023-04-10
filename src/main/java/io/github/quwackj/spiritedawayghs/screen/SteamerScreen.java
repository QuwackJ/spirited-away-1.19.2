package io.github.quwackj.spiritedawayghs.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public class SteamerScreen extends AbstractContainerScreen<SteamerMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(SpiritedAwayGHS.MOD_ID, "textures/gui/steamer.png");

    public SteamerScreen(SteamerMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    protected void renderBg(PoseStack stack, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        this.blit(stack, x, y, 0, 0, imageWidth,imageHeight);
        renderProgressArrow(stack, x, y);
    }

    private void renderProgressArrow(PoseStack poseStack, int x, int y) {
        if(menu.isCrafting()) {
            blit(poseStack, x + 80, y + 35, 177, 14, menu.getScaledProgress(), 16);
        }

        // Explaining the blit() method parameters:
        // poseStack, x coordinate for arrow location, y coordinate for arrow location,
        // x coordinate location for arrow texture, y coordinate location for arrow texture, width of arrow, length of arrow
        // menu.getScaledProgress returns a certain value that will determine the length of the arrow shown in correlation to the
        // progress of the recipe.
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float delta) {
        renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, delta);
        renderTooltip(poseStack, mouseX, mouseY);
    }
}
