
package net.mcreator.modysroda.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.modysroda.procedures.InfekcjaPinormOnEffectActiveTickProcedure;

public class InfekcjaPinormMobEffect extends MobEffect {
	public InfekcjaPinormMobEffect() {
		super(MobEffectCategory.HARMFUL, -3158065);
		setRegistryName("infekcja_pinorm");
	}

	@Override
	public String getDescriptionId() {
		return "effect.modysroda.infekcja_pinorm";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		InfekcjaPinormOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
