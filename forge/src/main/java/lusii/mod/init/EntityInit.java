package lusii.mod.init;

import lusii.mod.Main;
import lusii.mod.entity.EntityKiwi;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import util.Reference;

public class EntityInit 

{

	public static void registerEntities()

	{

		registerEntity("kiwi", EntityKiwi.class, Reference.ENTITY_KIWI, 50, 16711680, 16711680);

	}

	

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)

	{

		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);

	}

}