package lusii.mod;

import lusii.mod.handlers.RegistryHandler;
import lusii.mod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import util.Reference;


@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main
{
    public static final String MODID = "lusii";
    public static final String NAME = "Lusii";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	public static Main instance;
    
    
	@EventHandler

	public void preInit(FMLPreInitializationEvent event) 
	{	
		RegistryHandler.preInitRegistries(event);
	}
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	RegistryHandler.initRegistries(event);
    }
    @EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
    	RegistryHandler.postInitRegistries(event);
    }
    @EventHandler
	public static void serverInit(FMLServerStartingEvent event) {

    }
    

}
