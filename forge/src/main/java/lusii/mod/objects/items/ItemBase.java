package lusii.mod.objects.items;

import lusii.mod.Main;
import lusii.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import util.IHasModel;

public class ItemBase extends Item implements IHasModel 
{

	public ItemBase(String name, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		//change this to the lusii tab when creative tab tutorial done
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	@Override

	public void registerModels() 

	{

		Main.proxy.registerModel(this, 0);

	}

}
