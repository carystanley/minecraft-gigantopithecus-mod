package carystanley.gigantopithecus.client;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelRenderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelIronGolem;

@SideOnly(Side.CLIENT)
public class ModelYeti extends ModelIronGolem
{
    public ModelYeti()
    {
        super();
        short short1 = 128;
        short short2 = 128;

        float par1 = 0.0F;
        float par2 = -7.0F;

        this.ironGolemHead = (new ModelRenderer(this)).setTextureSize(short1, short2);
        this.ironGolemHead.setRotationPoint(0.0F, 0.0F + par2, -2.0F);
        this.ironGolemHead.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, par1);
        //this.ironGolemHead.setTextureOffset(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, par1);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
/*
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
            GL11.glTranslatef(0.0F, 16.0F * par7, 0.0F);
            this.bipedHead.render(par7);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
            this.bipedBody.render(par7);
            this.bipedRightArm.render(par7);
            this.bipedLeftArm.render(par7);
            this.bipedRightLeg.render(par7);
            this.bipedLeftLeg.render(par7);
            this.bipedHeadwear.render(par7);
            GL11.glPopMatrix();
    }
*/
/*
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
    {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);

        GL11.glPushMatrix();
        GL11.glScalef(2.0F, 2.0F, 2.0F);

        GL11.glTranslatef(0.0F, -12.0F * par7, 0.0F);

            this.bipedHead.render(par7);
            this.bipedBody.render(par7);
            this.bipedRightArm.render(par7);
            this.bipedLeftArm.render(par7);
            this.bipedRightLeg.render(par7);
            this.bipedLeftLeg.render(par7);
            this.bipedHeadwear.render(par7);
            GL11.glPopMatrix();
    }
*/
}
