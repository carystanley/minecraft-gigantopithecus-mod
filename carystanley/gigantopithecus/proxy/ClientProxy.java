package carystanley.gigantopithecus.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.RenderIronGolem;

import carystanley.gigantopithecus.client.RenderYeti;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

import carystanley.gigantopithecus.entity.EntityGigantopithecus;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
		
	@Override
	public void initRenderingAndTextures() {}

/*	
	@Override
	public void registerRenderers () 
	{
		backpackRenderer = new ItemCampingBagRenderer();
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCampfire.class, new TileEntityCampfireRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTent.class, new TileEntityTentRenderer());
		
		MinecraftForgeClient.registerItemRenderer(ModItems.CampingBag.itemID, backpackRenderer);
	}
	
	@Override
    public void setKeyBinding(String name, int value) 
    {
        KeyHelper.addKeyBinding(name, value);
        KeyHelper.addIsRepeating(false);
    }
    
    @Override
    public void registerKeyBindingHandler() 
    {
        KeyBindingRegistry.registerKeyBinding(new KeyHandler());
    }
    
    @Override
    public void registerTickHandler()
    {
    	TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
    }
  */  
    @Override
	public void registerEntityRenderHandler()
	{
		//RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, new RenderPlayer());
		//RenderingRegistry.registerEntityRenderingHandler(EntityGigantopithecus.class, new RenderPlayer());
		//MinecraftForgeClient.preloadTexture("/gigantopithecus/yeti.png");
		
		RenderingRegistry.registerEntityRenderingHandler(EntityGigantopithecus.class, new RenderYeti());
	}
  /*  
    @Override
    public void registerPlayerHandlers()
    {
	    GameRegistry.registerPlayerTracker(playerHandler);
	    MinecraftForge.EVENT_BUS.register(playerHandler);
    }
  */
}