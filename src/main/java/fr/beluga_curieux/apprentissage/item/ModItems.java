package fr.beluga_curieux.apprentissage.item;

import fr.beluga_curieux.apprentissage.Apprentissage;
import fr.beluga_curieux.apprentissage.block.ModBlocks;
import fr.beluga_curieux.apprentissage.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TRUC_INGOT = registerItem("truc_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_TRUC = registerItem("raw_truc", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR_ITEM = registerItem("metal_detector_item",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(100)));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(TRUC_INGOT);
        entries.add(ModBlocks.TRUC_BLOCK);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Apprentissage.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Apprentissage.LOGGER.info("Registering mod items for " + Apprentissage.MOD_ID );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
