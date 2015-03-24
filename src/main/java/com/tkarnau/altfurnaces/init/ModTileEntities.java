package com.tkarnau.altfurnaces.init;


import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModTileEntities
{
    //public static final TileEntityEmeraldFurnace teEmeraldFurnace = new TileEntityEmeraldFurnace(0);

    public static void init()
    {
        GameRegistry.registerTileEntity(TileEntityEmeraldFurnace.class, "emeraldfurnace");
    }
}
