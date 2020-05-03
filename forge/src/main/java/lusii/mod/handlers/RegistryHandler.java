package lusii.mod.handlers;

import lusii.mod.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import util.IHasModel;

@EventBusSubscriber
public class RegistryHandler {
	

	public static void preInitRegistries(FMLPreInitializationEvent event) {
		
		RenderHandler.registerEntityRenders();
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event)
	{
		RenderHandler.registerEntityRenders();
		for(Item item : ItemInit.ITEMS) 
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
	}

	public static void initRegistries(FMLInitializationEvent event) {
		RenderHandler.registerEntityRenders();
		
	}

	public static void postInitRegistries(FMLPostInitializationEvent event) {
		RenderHandler.registerEntityRenders();
		
	}

	
}
