package com.tkarnau.altfurnaces.inventory;

import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class ContainerEmeraldFurnace extends ContainerAF
{
    private TileEntityEmeraldFurnace tileEntityEmeraldFurnace;
    private int chestInventoryRows;
    private int chestInventoryColumns;

    public ContainerEmeraldFurnace(InventoryPlayer inventoryPlayer, TileEntityEmeraldFurnace tileEntityEmeraldFurnace)
    {
        this.tileEntityEmeraldFurnace = tileEntityEmeraldFurnace;
        tileEntityEmeraldFurnace.openInventory();

        chestInventoryRows = 1;
        chestInventoryColumns = 1;

        for (int chestRowIndex = 0; chestRowIndex < chestInventoryRows; ++chestRowIndex)
        {
            for (int chestColumnIndex = 0; chestColumnIndex < chestInventoryColumns; ++chestColumnIndex)
            {
                this.addSlotToContainer(new Slot(tileEntityEmeraldFurnace, chestColumnIndex + chestRowIndex * chestInventoryColumns, 8 + chestColumnIndex * 18, 18 + chestRowIndex * 18));
            }
        }
    }
}
