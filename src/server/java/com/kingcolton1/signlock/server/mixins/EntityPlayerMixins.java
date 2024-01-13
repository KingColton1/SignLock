package com.kingcolton1.signlock.server.mixins;

import net.minecraft.src.game.entity.EntityLiving;
import net.minecraft.src.game.entity.player.EntityPlayer;
import net.minecraft.src.game.level.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

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