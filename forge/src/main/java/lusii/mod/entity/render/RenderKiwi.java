package lusii.mod.entity.render;

import lusii.mod.entity.EntityKiwi;
import lusii.mod.entity.model.ModelKiwi;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import util.Reference;

@SideOnly(Side.CLIENT)
public class RenderKiwi extends RenderLiving<EntityKiwi>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID+":textures/entity/kiwi.png");

	public RenderKiwi(RenderManager manager) {
		super(manager, new ModelKiwi(), 0.5F);
	}
	@Override
	protected ResourceLocation getEntityTexture(EntityKiwi entity) {
		return TEXTURES;
	}
	@Override
	protected void applyRotations(EntityKiwi entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
