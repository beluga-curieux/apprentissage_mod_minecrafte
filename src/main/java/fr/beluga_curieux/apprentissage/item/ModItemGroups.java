package fr.beluga_curieux.apprentissage.item;

import fr.beluga_curieux.apprentissage.Apprentissage;
import fr.beluga_curieux.apprentissage.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.MagmaBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GROUPEEPEEPEP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Apprentissage.MOD_ID, "group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.group"))
                    .icon(() -> new ItemStack(ModItems.TRUC_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TRUC_INGOT);
                        entries.add(ModItems.RAW_TRUC);


                        entries.add(ModBlocks.TRUC_BLOCK);
                        entries.add(ModBlocks.RAW_TRUC_BLOCK);



                    }).build());
    public static void registerItemGroups() {
        Apprentissage.LOGGER.info("registering item group for " + Apprentissage.MOD_ID);

    }
}
