package net.blahblahbal.coreascent.block;

import net.blahblahbal.coreascent.CoreAscension;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{
    public static final Block SULPHUR_BLOCK = registerBlock("sulphur_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f, 6f).requiresTool()),
            ItemGroup.MISC);
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5f, 6f).requiresTool()),
            ItemGroup.MISC);

    public static final Block SULPHUR_ORE = registerBlock("sulphur_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.25f, 10f).requiresTool()),
            ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(CoreAscension.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(CoreAscension.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks()
    {
        CoreAscension.LOGGER.info("Registering mod blocks for " + CoreAscension.MOD_ID);
    }
}
