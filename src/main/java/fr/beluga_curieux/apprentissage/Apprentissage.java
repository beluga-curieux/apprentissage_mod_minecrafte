package fr.beluga_curieux.apprentissage;

import fr.beluga_curieux.apprentissage.block.ModBlocks;
import fr.beluga_curieux.apprentissage.item.ModItemGroups;
import fr.beluga_curieux.apprentissage.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apprentissage implements ModInitializer {
	public  static  final  String MOD_ID = "apprentissage";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}