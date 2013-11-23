package carystanley.gigantopithecus.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderYeti extends RenderBiped {
    private static final ResourceLocation yetiTexture = new ResourceLocation("gigantopithecus:yeti.png");

    public RenderYeti()
    {
         super(new ModelBiped(0.0F), 0.3F);
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return yetiTexture;
    }
}