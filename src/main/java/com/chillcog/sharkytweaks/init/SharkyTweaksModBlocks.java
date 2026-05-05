/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.chillcog.sharkytweaks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import com.chillcog.sharkytweaks.block.UnderwaterMineBlock;
import com.chillcog.sharkytweaks.SharkyTweaksMod;

public class SharkyTweaksModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SharkyTweaksMod.MODID);
	public static final DeferredBlock<Block> UNDERWATER_MINE;
	static {
		UNDERWATER_MINE = REGISTRY.register("underwater_mine", UnderwaterMineBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}