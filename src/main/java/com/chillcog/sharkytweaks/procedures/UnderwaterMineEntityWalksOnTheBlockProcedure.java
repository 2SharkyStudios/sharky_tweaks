package com.chillcog.sharkytweaks.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

public class UnderwaterMineEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 40, Level.ExplosionInteraction.BLOCK);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}