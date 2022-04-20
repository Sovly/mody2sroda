
package net.mcreator.modysroda.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ZelaznypatykItem extends Item {
	public ZelaznypatykItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("zelaznypatyk");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
