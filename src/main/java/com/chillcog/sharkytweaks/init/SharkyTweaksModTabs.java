/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.chillcog.sharkytweaks.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.chillcog.sharkytweaks.SharkyTweaksMod;

@EventBusSubscriber
public class SharkyTweaksModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SharkyTweaksMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SHARKY = REGISTRY.register("sharky",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.sharky_tweaks.sharky")).icon(() -> new ItemStack(Items.PUFFERFISH)).displayItems((parameters, tabData) -> {
				tabData.accept(SharkyTweaksModItems.ADMIN_AXE.get());
				tabData.accept(SharkyTweaksModBlocks.UNDERWATER_MINE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(SharkyTweaksModItems.ADMIN_AXE.get());
			}
		}
	}
}