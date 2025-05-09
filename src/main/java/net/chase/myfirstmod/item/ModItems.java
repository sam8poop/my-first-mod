package net.chase.myfirstmod.item;

import net.chase.myfirstmod.MyFirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registeritem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registeritem("raw_pink_garnet", new Item(new Item.Settings()));

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MyFirstMod.MOD_ID, name), item);
    }

    public static void registsrModItems() {
        MyFirstMod.LOGGER.info("Registering Mod Itmes for " + MyFirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(PINK_GARNET);
           fabricItemGroupEntries.add(RAW_PINK_GARNET);
        });
    }
}
