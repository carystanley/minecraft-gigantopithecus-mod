package carystanley.gigantopithecus.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


import cpw.mods.fml.common.network.IGuiHandler;

public class CommonProxy {

	public void initRenderingAndTextures() {} 
	public void registerRenderers() {}
	public void registerTileEntitySpecialRenderer(TileEntity tileentity){}
    public void registerKeyBindingHandler() {}
    public void setKeyBinding(String name, int value) {}   
    public void registerTickHandler() {}
	public void registerEntityRenderHandler() {}
	public void registerPlayerHandlers() {}

}