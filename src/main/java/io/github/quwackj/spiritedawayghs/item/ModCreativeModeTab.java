package io.github.quwackj.spiritedawayghs.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_SPIRITEDAWAY = new CreativeModeTab("spiritedawaytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GREEN_KONPEITO.get());
        }
    };
}
