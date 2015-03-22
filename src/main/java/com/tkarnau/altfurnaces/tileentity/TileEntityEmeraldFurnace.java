package com.tkarnau.altfurnaces.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;


public class TileEntityEmeraldFurnace extends TileEntity
{
    private String localizedName;

    public void setGuiDisplayName(String displayName)
    {
        this.localizedName = displayName;
    }

}
