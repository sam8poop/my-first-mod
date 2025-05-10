package net.chase.myfirstmod.item.custom;

import net.chase.myfirstmod.block.Modblocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    Blocks.STONE, Blocks.STONE_BRICKS,
                    Blocks.END_STONE, Blocks.END_STONE_BRICKS,
                    Blocks.OAK_LOG, Modblocks.PINK_GARNET_BLOCK,
                    Blocks.TNT, Blocks.NETHER_PORTAL,
                    Blocks.NETHER_PORTAL, Blocks.TNT,
                    Blocks.SAND, Blocks.GLASS,
                    Blocks.GLASS, Blocks.SAND,
                    Blocks.OBSIDIAN, Blocks.BEDROCK,
                    Blocks.BEDROCK, Blocks.OBSIDIAN


            );

    public ChiselItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();


        if (CHISEL_MAP.containsKey(clickedBlock)) {
            if (!world.isClient) {
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);

            }
        }





        return ActionResult.SUCCESS;
    }
}
