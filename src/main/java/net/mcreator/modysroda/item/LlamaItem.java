
package net.mcreator.modysroda.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public class LlamaItem extends RecordItem {
	public LlamaItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.llama.spit")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("llama");
	}
}
