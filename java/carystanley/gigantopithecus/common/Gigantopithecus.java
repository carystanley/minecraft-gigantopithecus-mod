package carystanley.gigantopithecus.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

import carystanley.gigantopithecus.entity.EntityGigantopithecus;
import carystanley.gigantopithecus.proxy.CommonProxy;
import carystanley.gigantopithecus.proxy.ClientProxy;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;

@Mod(modid = "carystanley_gigantopithecus", name = "Gigantopithecus", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Gigantopithecus {

    @Instance("carystanley_gigantopithecus")
    public static Gigantopithecus instance;

    @SidedProxy(clientSide = "carystanley.gigantopithecus.proxy.ClientProxy", serverSide = "carystanley.gigantopithecus.proxy.CommonProxy")
    public static CommonProxy proxy;

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerEntityRenderHandler();
		
		loadRecipes();
		loadLang();
		loadMobs();
	}
	
	public void loadRecipes() {

	}

	public void loadMobs() {
		//EntityRegistry.registerModEntity(EntityGigantopithecus.class, "Gigantopithecus", 1, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityGigantopithecus.class, "Gigantopithecus", 1, Gigantopithecus.instance, 80, 3, true);

		EntityList.IDtoClassMapping.put(500, EntityGigantopithecus.class);
		EntityList.entityEggs.put(500, new EntityEggInfo(500, 0x747B51, 0x70471B));
	}
	
	public void loadLang() {

	}

}
