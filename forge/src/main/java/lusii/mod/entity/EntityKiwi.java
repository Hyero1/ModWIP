package lusii.mod.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityKiwi extends EntityChicken{

	public EntityKiwi(World worldIn) {
		super(worldIn);
		this.setSize(0.9F, 2.8F);
		}
	public EntityChicken createChild(EntityAgeable ageable)
	{
			return new EntityKiwi(world);
	}
	@Override
	protected SoundEvent getAmbientSound() {
		return super.getAmbientSound();
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return super.getHurtSound(source);
	}
	@Override
	protected SoundEvent getDeathSound() {
		return super.getDeathSound();
	}
}
