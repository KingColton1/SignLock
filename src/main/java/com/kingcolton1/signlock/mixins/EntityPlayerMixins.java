package com.kingcolton1.signlock.mixins;

import net.minecraft.common.entity.EntityLiving;
import net.minecraft.common.entity.player.EntityPlayer;
import net.minecraft.common.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = EntityPlayer.class, remap = false)
public abstract class EntityPlayerMixins extends EntityLiving {
	@Unique
	protected EntityPlayer thisAs = (EntityPlayer)(Object)this;
	public EntityPlayerMixins(World world) {
		super(world);
	}

	public void placeSign() {
		// TODO: figure out how to detect player's placing event.
	}

}