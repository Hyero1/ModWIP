package lusii.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;



public class LusiiTab extends CreativeTabs
{
	public LusiiTab() 
	{
		super("Lusii");
	}

	@Override

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Items.APPLE);

	}

}