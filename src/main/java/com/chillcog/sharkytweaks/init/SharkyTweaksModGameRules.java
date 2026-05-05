/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.chillcog.sharkytweaks.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber
public class SharkyTweaksModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> SHARK_SPAWNING;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		SHARK_SPAWNING = GameRules.register("sharkSpawning", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
	}
}