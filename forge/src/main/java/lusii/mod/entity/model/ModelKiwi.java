package lusii.mod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports
@SideOnly(Side.CLIENT)
public class ModelKiwi extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelKiwi() {
		textureWidth = 16;
		textureHeight = 16;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.7F, -0.8F);
		head.cubeList.add(new ModelBox(head, 8, 8, -1.0F, 0.8F, -2.7F, 2, 2, 2, 0.5F, false));
		head.cubeList.add(new ModelBox(head, 0, 8, -0.5F, 1.5F, -7.7F, 1, 1, 6, -1.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.5F, -1.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -2.25F, 1.0F, -1.5F, 4, 4, 4, 0.0F, false));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.1F, 1.2F);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(1.5F, 16.9F, -0.8F);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(-1.5F, 16.9F, -0.8F);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.0F, 22.0F, -1.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 12, 0, -1.5F, -1.0F, 0.5F, 1, 3, 1, 0.0F, false));
		left_leg.cubeList.add(new ModelBox(left_leg, 8, 12, -1.5F, -2.0F, 0.5F, 1, 1, 1, 0.51F, false));
		left_leg.cubeList.add(new ModelBox(left_leg, 0, 0, -1.5F, 2.0F, -0.5F, 1, 0, 2, 0.01F, false));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(1.0F, 22.0F, -1.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 8, 0.5F, -1.0F, 0.5F, 1, 3, 1, 0.0F, false));
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 2, 0.5F, 2.0F, -0.5F, 1, 0, 2, 0.01F, false));
		right_leg.cubeList.add(new ModelBox(right_leg, 0, 12, 0.5F, -2.0F, 0.5F, 1, 1, 1, 0.51F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		tail.render(f5);
		left_wing.render(f5);
		right_wing.render(f5);
		left_leg.render(f5);
		right_leg.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}