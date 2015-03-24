package com.tkarnau.altfurnaces.inventory;

import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;
import com.tkarnau.altfurnaces.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

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
                LogHelper.info("Adding Slot To emerald furnace container");
                this.addSlotToContainer(new Slot(tileEntityEmeraldFurnace, chestColumnIndex + chestRowIndex * chestInventoryColumns, 8 + chestColumnIndex * 18, 18 + chestRowIndex * 18));
            }
        }
        LogHelper.info("Finished ctor for ContainerEmeraldFurnace");
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int slotIndex)
    {
        ItemStack newItemStack = null;
        Slot slot = (Slot) inventorySlots.get(slotIndex);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemStack = slot.getStack();
            newItemStack = itemStack.copy();

            if (slotIndex < chestInventoryRows * chestInventoryColumns)
            {
                if (!this.mergeItemStack(itemStack, chestInventoryRows * chestInventoryColumns, inventorySlots.size(), false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemStack, 0, chestInventoryRows * chestInventoryColumns, false))
            {
                return null;
            }

            if (itemStack.stackSize == 0)
            {
                slot.putStack(null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return newItemStack;
    }
}
