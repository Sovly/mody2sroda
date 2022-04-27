
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modysroda.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.modysroda.block.ZarosnietekraryBlock;
import net.mcreator.modysroda.block.MetalowafurtkaBlock;
import net.mcreator.modysroda.block.KratyBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModysrodaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block KRATY = register(new KratyBlock());
	public static final Block ZAROSNIETEKRARY = register(new ZarosnietekraryBlock());
	public static final Block METALOWAFURTKA = register(new MetalowafurtkaBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			KratyBlock.registerRenderLayer();
			ZarosnietekraryBlock.registerRenderLayer();
		}
	}
}
