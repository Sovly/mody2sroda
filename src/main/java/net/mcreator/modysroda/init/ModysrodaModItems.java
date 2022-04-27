
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modysroda.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;


import net.minecraft.world.item.Item;

import net.mcreator.modysroda.item.ZelaznypatykItem;
import net.mcreator.modysroda.item.ZelaznyjednostronnykilofItem;
import net.mcreator.modysroda.item.LlamaItem;


import net.minecraft.world.item.Item;

import net.mcreator.modysroda.item.TopazItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;



import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModysrodaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();

	public static final Item ZELAZNYPATYK = register(new ZelaznypatykItem());
	public static final Item ZELAZNYJEDNOSTRONNYKILOF = register(new ZelaznyjednostronnykilofItem());
	public static final Item LLAMA = register(new LlamaItem());


	public static final Item TOPAZ = register(new TopazItem());

	public static final Item KRATY = register(ModysrodaModBlocks.KRATY, ModysrodaModTabs.TAB_ZAKLADKA_1);
	public static final Item ZAROSNIETEKRARY = register(ModysrodaModBlocks.ZAROSNIETEKRARY, ModysrodaModTabs.TAB_ZAKLADKA_1);
	public static final Item METALOWAFURTKA = register(ModysrodaModBlocks.METALOWAFURTKA, ModysrodaModTabs.TAB_ZAKLADKA_1);



	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}




	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}



	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
