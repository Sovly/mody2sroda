
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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModysrodaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ZELAZNYPATYK = register(new ZelaznypatykItem());
	public static final Item ZELAZNYJEDNOSTRONNYKILOF = register(new ZelaznyjednostronnykilofItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}