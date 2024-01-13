package com.kingcolton1.signlock;

import net.minecraft.src.game.block.Block;

public class FindSign {
    int signID = Block.signWall.getBlockID();
    int chestID = Block.chest.getBlockID();

    public void findSign() {
        int blockFace = Block.chest.getBlockTextureFromSideAndMetadata(signID, chestID);
        System.out.println(blockFace);
    }
}
