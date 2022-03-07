package net.blahblahbal.coreascent.item;

import net.blahblahbal.coreascent.CoreAscension;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems
{
    public static final Item SULPHUR = registerItem("sulphur", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item CITRINE = registerItem("citrine", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(CoreAscension.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        CoreAscension.LOGGER.info("Registering mod items for " + CoreAscension.MOD_ID);

    }
}
