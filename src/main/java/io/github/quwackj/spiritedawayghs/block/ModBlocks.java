package io.github.quwackj.spiritedawayghs.block;

import io.github.quwackj.spiritedawayghs.SpiritedAwayGHS;
import io.github.quwackj.spiritedawayghs.block.custom.PeachBlock;
import io.github.quwackj.spiritedawayghs.block.custom.StatueBlock;
import io.github.quwackj.spiritedawayghs.block.custom.SteamerBlock;
import io.github.quwackj.spiritedawayghs.item.ModCreativeModeTab;
import io.github.quwackj.spiritedawayghs.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SpiritedAwayGHS.MOD_ID);

    public static final RegistryObject<Block> STEAMER = registerBlock("steamer",
            () -> new SteamerBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(2.0F, 3.0F).sound(SoundType.BAMBOO)), ModCreativeModeTab.TAB_SPIRITEDAWAY);
    public static final RegistryObject<Block> PEACH_BUNS = registerBlock("peach_buns",
            () -> new PeachBlock(BlockBehaviour.Properties.of(Material.CAKE).noOcclusion().strength(2.0F,3.0F).sound(SoundType.BAMBOO)), ModCreativeModeTab.TAB_SPIRITEDAWAY);
    public static final RegistryObject<Block> STATUE = registerBlock("statue",
            () -> new StatueBlock(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(3.0F, 4.0F).sound(SoundType.STONE)), ModCreativeModeTab.TAB_SPIRITEDAWAY);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
