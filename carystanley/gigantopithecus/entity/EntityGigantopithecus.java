package carystanley.gigantopithecus.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

import net.minecraft.entity.monster.IMob;

import net.minecraft.entity.SharedMonsterAttributes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityGigantopithecus extends EntityAnimal {
	
	  boolean spawn;
	  Random random = new Random();

	 public EntityGigantopithecus(World par1World) 
	 {
		  super(par1World);
		  this.setSize(6.4F, 6.9F);
	//	this.yOffset *= 6.0F;
		  //this.moveSpeed = 0.30F;
		//this.setScale(0.5F);
		  //this.texture = "Textures.MODEL_LOCATION + Textures.MODEL_CAMPER_MALE";
		  this.setSize(0.6F, 1.8F);
		  this.tasks.addTask(0, new EntityAISwimming(this));
		  //this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityMob.class, 8.0F, 0.3F, 0.35F));

        //this.tasks.addTask(1, new EntityAILeapAtTarget(this, 0.4F));
         this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
         this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));

		  //this.tasks.addTask(1, new EntityAITradePlayerCamper(this));
		  //this.tasks.addTask(1, new EntityAILookAtTradePlayerCamper(this));
		  this.tasks.addTask(2, new EntityAIOpenDoor(this, true));
		  this.tasks.addTask(3, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
		  //this.tasks.addTask(3, new EntityAIWatchClosest2(this, Camper.class, 5.0F, 0.02F));
		  this.tasks.addTask(3, new EntityAIWander(this, 0.3F));
		  this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
		
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, false, true, IMob.mobSelector));
	 }
	 
	private boolean isPlaying;

	//public int getMaxHealth() 
	//{
	//	 return 24;
	//}
	
	protected boolean isAIEnabled()
	{
		 return true;
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25D);
    }
	 
	public EnumCreatureAttribute getCreatureAttribute()
	{
		 return EnumCreatureAttribute.UNDEFINED;
	}
	 
	public int getAttackStrength(Entity par1Entity)
	{
	     return 12;
	}
	 
	 protected boolean canDespawn()
	 {
		 return false;
	 }

	 protected String getLivingSound()
	 {
		 return "mob.villager.default";
	 }

	 protected String getHurtSound()
	 {
	     return "mob.villager.defaulthurt";
	 }

	 protected String getDeathSound()
	 {
	     return "mob.villager.defaultdeath";
	 }

	 protected void playStepSound(int par1, int par2, int par3, int par4)
	 {
		 this.worldObj.playSoundAtEntity(this, "mob.villager.step", 0.15F, 1.0F);
	 }

    public void setPlaying(boolean par1)
    {
        this.isPlaying = par1;
    }

    public boolean isPlaying()
    {
        return this.isPlaying;
    }

   // public void func_82187_q()
   // {
   //     this.field_82190_bM = true;
   // }

	@Override
	public EntityAgeable createChild(EntityAgeable entityageable) 
	{
		return null;
	}
}