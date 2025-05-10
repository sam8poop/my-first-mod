package net.chase.myfirstmod.item;

import net.chase.myfirstmod.MyFirstMod;
import net.chase.myfirstmod.block.Modblocks;
import net.chase.myfirstmod.block.custom.MagicBlock;
import net.chase.myfirstmod.item.custom.ChiselItem;
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

                        entries.add(ModItems.CAULIFLOWER);

                        entries.add(ModItems.CHISEL);
                    }).build());
    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFirstMod.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Modblocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.myfirstmod.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(Modblocks.PINK_GARNET_BLOCK);
                        entries.add(Modblocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(Modblocks.PINK_GARNET_DEEPSLATE_ORE);
                        entries.add(Modblocks.PINK_GARNET_ORE);

                        entries.add(Modblocks.MAGIC_BLOCK);



                    }).build());
    public static final ItemGroup ENDER_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFirstMod.MOD_ID, "ender_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Modblocks.ENDER_BLOCK))
                    .displayName(Text.translatable("itemgroup.myfirstmod.ender_group"))
                    .entries((displayContext, entries) -> {
                       entries.add(ModItems.ENDER_INGOT);
                       entries.add(Modblocks.ENDER_BLOCK);

                    }).build());


    public static void registerItemGroups() {
        MyFirstMod.LOGGER.info("registering Item Groups for " + MyFirstMod.MOD_ID);
    }
}
