package com.kingcolton1.signlock;

import net.minecraft.common.block.children.BlockSign;
import net.minecraft.common.block.children.BlockChest;
import net.minecraft.common.world.BlockAccess;
import net.minecraft.common.world.World;
import net.minecraft.common.block.Block;
import net.minecraft.common.block.texture.Face;

import com.fox2code.foxloader.*;

public class FindSign {
    World world;
    String signID = BlockSign.getBlockByName("sign");
    String chestID = BlockChest.getBlockByName("chest");

    public void findSign() {
        BlockAccess blockAccess = world;
        int blockId = blockAccess.getBlockId(10, 60, 10);
        int blockFace = Face.NORTH.direction();
        System.out.println(blockFace);
    }
}
