package carystanley.gigantopithecus.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderIronGolem;
import net.minecraft.client.renderer.entity.RenderLiving;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderYeti extends RenderLiving {
    private static final ResourceLocation yetiTexture = new ResourceLocation("gigantopithecus:yeti.png");

    public RenderYeti()
    {
         super(new ModelYeti(), 0.5F);
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return yetiTexture;
    }
}