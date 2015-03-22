package com.tkarnau.altfurnaces.init;


import com.tkarnau.altfurnaces.block.BlockAF;
import com.tkarnau.altfurnaces.block.BlockEmeraldFurnace;
import com.tkarnau.altfurnaces.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static BlockAF emeraldfurnace = new BlockEmeraldFurnace();

    public static void init()
    {
        GameRegistry.registerBlock(emeraldfurnace, "emeraldfurnace");
    }
}
