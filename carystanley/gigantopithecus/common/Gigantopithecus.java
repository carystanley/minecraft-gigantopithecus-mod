package carystanley.gigantopithecus.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "carystanley_gigantopithecus", name = "Gigantopithecus", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Gigantopithecus {

	@Init
	public void load(FMLInitializationEvent event) {
		loadRecipes();
		loadLang();
	}
	
	public void loadRecipes() {

	}
	
	public void loadLang() {

	}

}
