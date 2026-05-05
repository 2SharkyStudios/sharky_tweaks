/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.chillcog.sharkytweaks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.chillcog.sharkytweaks.item.AdminAxeItem;
import com.chillcog.sharkytweaks.SharkyTweaksMod;

public class SharkyTweaksModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SharkyTweaksMod.MODID);
	public static final DeferredItem<Item> ADMIN_AXE;
	public static final DeferredItem<Item> UNDERWATER_MINE;
	static {
		ADMIN_AXE = REGISTRY.register("admin_axe", AdminAxeItem::new);
		UNDERWATER_MINE = block(SharkyTweaksModBlocks.UNDERWATER_MINE, new Item.Properties().rarity(Rarity.RARE));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}