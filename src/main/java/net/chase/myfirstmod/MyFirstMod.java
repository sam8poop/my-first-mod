package net.chase.myfirstmod;

import net.chase.myfirstmod.block.Modblocks;
import net.chase.myfirstmod.item.ModItems;
import net.chase.myfirstmod.item.ModitemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstMod implements ModInitializer {
	public static final String MOD_ID = "myfirstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModitemGroups.registerItemGroups();
		
		ModItems.registsrModItems();
		Modblocks.registerModBlocks();
	}
}