package net.chase.myfirstmod.item;

import net.chase.myfirstmod.MyFirstMod;
import net.chase.myfirstmod.block.Modblocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModitemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFirstMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.myfirstmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                    }).build());
    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFirstMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Modblocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.myfirstmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(Modblocks.PINK_GARNET_BLOCK);
                        entries.add(Modblocks.RAW_PINK_GARNET_BLOCK);

                    }).build());



    public static void registerItemGroups() {
        MyFirstMod.LOGGER.info("registering Item Groups for " + MyFirstMod.MOD_ID);
    }
}
