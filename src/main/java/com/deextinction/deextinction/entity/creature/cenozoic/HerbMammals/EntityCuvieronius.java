package com.deextinction.deextinction.entity.creature.cenozoic.HerbMammals;

import com.deextinction.deextinction.entity.EntityDeex;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntityArctotherium;
import com.deextinction.deextinction.entity.creature.cenozoic.CarnivoresMammals.EntitySmilodon;
import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityCuvieronius extends EntityDeex


{

	public EntityCuvieronius(World worldIn) {
		super(worldIn);
		this.setSize(1.2F, 2.0F);
	}
	//@Override
	//protected void entityInit() {
		 //TODO Auto-generated method stub
		
	//}
	
	//@Override
	//public void readEntityFromNBT(NBTTagCompound compound)	
//	{
		
//	}
	
//	@Override
//	public void writeEntityToNBT(NBTTagCompound compound)	
//	{
		
//	}

//	public boolean isAIEnabled() {
//		return true;
//	}
	
	@Override
	protected void initEntityAI()
	{
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 1.0D));
		this.targetTasks.addTask(1, new EntityCuvieronius.AIHurtByTarget());
        this.targetTasks.addTask(2, new EntityCuvieronius.AIAttackPlayer());
	this.tasks.addTask(3, new EntityAIAttackMelee(this, 1.9D, true));
    this.tasks.addTask(4, new EntityAILookIdle(this));

	}
	
	@Override
	protected void applyEntityAttributes() 
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(60.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.198D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
	
		
	}
	

	public boolean attackEntityAsMob(Entity entityIn)
    {
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)((int)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue()));

        if (flag)
        {
            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }

	class AIAttackPlayer extends EntityAINearestAttackableTarget<EntityPlayer>
    {
        public AIAttackPlayer()
        {
            super(EntityCuvieronius.this, EntityPlayer.class, 20, true, true, (Predicate)null);
        }
	
}
	
	 class AIHurtByTarget extends EntityAIHurtByTarget
	    {
	        public AIHurtByTarget()
	        {
	            super(EntityCuvieronius.this, false);
	        }


	    }
	
	
	
}
	 
	
	    

