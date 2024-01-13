package com.kingcolton1.signlock.server.mixins;

import com.fox2code.foxloader.network.NetworkPlayer;
import com.kingcolton1.blockelevator.BlockElevatorServer;
import net.minecraft.src.game.entity.EntityLiving;
import net.minecraft.src.game.entity.player.EntityPlayer;
import net.minecraft.src.game.level.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.kingcolton1.blockelevator.Elevator;

@Mixin(value = EntityPlayer.class, remap = false)
public abstract class EntityPlayerMixin extends EntityLiving {
	@Unique
	protected EntityPlayer thisAs = (EntityPlayer)(Object)this;
	public EntityPlayerMixin(World world) {
		super(world);
	}

}