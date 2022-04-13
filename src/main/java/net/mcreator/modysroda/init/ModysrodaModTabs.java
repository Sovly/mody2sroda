
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modysroda.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModysrodaModTabs {
	public static CreativeModeTab TAB_ZAKLADKA_1;

	public static void load() {
		TAB_ZAKLADKA_1 = new CreativeModeTab("tabzakladka_1") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.WARPED_HYPHAE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
