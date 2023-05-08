package net.swutm.countrysflags.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.swutm.countrysflags.block.custom.*;
import net.swutm.countrysflags.countrysflags;
import net.swutm.countrysflags.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, countrysflags.MOD_ID);

    public static final RegistryObject<Block> FLAG = registerBlock("flag",
            () -> new FlagBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG1 = registerBlock("flag_1",
            () -> new FlagBlock1(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG2 = registerBlock("flag_2",
            () -> new FlagBlock2(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG3 = registerBlock("flag_3",
            () -> new FlagBlock3(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG4 = registerBlock("flag_4",
            () -> new FlagBlock4(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG5 = registerBlock("flag_5",
            () -> new FlagBlock5(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG6 = registerBlock("flag_6",
            () -> new FlagBlock6(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG7 = registerBlock("flag_7",
            () -> new FlagBlock7(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG8 = registerBlock("flag_8",
            () -> new FlagBlock8(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG9 = registerBlock("flag_9",
            () -> new FlagBlock9(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG10 = registerBlock("flag_10",
            () -> new FlagBlock10(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG11 = registerBlock("flag_11",
            () -> new FlagBlock11(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG12 = registerBlock("flag_12",
            () -> new FlagBlock12(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG13 = registerBlock("flag_13",
            () -> new FlagBlock13(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG14 = registerBlock("flag_14",
            () -> new FlagBlock14(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG15 = registerBlock("flag_15",
            () -> new FlagBlock15(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG16 = registerBlock("flag_16",
            () -> new FlagBlock16(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG17 = registerBlock("flag_17",
            () -> new FlagBlock17(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG18 = registerBlock("flag_18",
            () -> new FlagBlock18(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG19 = registerBlock("flag_19",
            () -> new FlagBlock19(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG20 = registerBlock("flag_20",
            () -> new FlagBlock20(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG21 = registerBlock("flag_21",
            () -> new FlagBlock21(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG22 = registerBlock("flag_22",
            () -> new FlagBlock22(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG23 = registerBlock("flag_23",
            () -> new FlagBlock23(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG24 = registerBlock("flag_24",
            () -> new FlagBlock24(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG25 = registerBlock("flag_25",
            () -> new FlagBlock25(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG26 = registerBlock("flag_26",
            () -> new FlagBlock26(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG27 = registerBlock("flag_27",
            () -> new FlagBlock27(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG28 = registerBlock("flag_28",
            () -> new FlagBlock28(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG29 = registerBlock("flag_29",
            () -> new FlagBlock29(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG30 = registerBlock("flag_30",
            () -> new FlagBlock30(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG31 = registerBlock("flag_31",
            () -> new FlagBlock31(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG32 = registerBlock("flag_32",
            () -> new FlagBlock32(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG33 = registerBlock("flag_33",
            () -> new FlagBlock33(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> FLAG34 = registerBlock("flag_34",
            () -> new FlagBlock34(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),

            CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
