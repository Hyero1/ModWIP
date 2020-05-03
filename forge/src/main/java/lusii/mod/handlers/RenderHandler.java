package lusii.mod.handlers;

import lusii.mod.entity.EntityKiwi;
import lusii.mod.entity.render.RenderKiwi;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@SideOnly(Side.CLIENT)
public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKiwi.class, new IRenderFactory<EntityKiwi>()
				{

					@Override
					public Render<? super EntityKiwi> createRenderFor(RenderManager manager) 
					{
						return new RenderKiwi(manager);
					}
				});
	}

		
	}
