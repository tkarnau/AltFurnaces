package com.tkarnau.altfurnaces.handler;


import com.tkarnau.altfurnaces.inventory.ContainerEmeraldFurnace;
import com.tkarnau.altfurnaces.reference.GUIs;
import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        if (id == GUIs.EMERALD_FURNACE.ordinal())
        {
            TileEntityEmeraldFurnace tileEntityEmeraldFurnace = (TileEntityEmeraldFurnace)world.getTileEntity(x,y,z);
            return new ContainerEmeraldFurnace(player.inventory, tileEntityEmeraldFurnace);
            /*
            TileEntityAlchemicalChest tileEntityAlchemicalChest = (TileEntityAlchemicalChest) world.getTileEntity(x, y, z);
            return new ContainerAlchemicalChest(entityPlayer.inventory, tileEntityAlchemicalChest);
            */
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        if (id == GUIs.EMERALD_FURNACE.ordinal())
        {
            TileEntityEmeraldFurnace tileEntityEmeraldFurnace = (TileEntityEmeraldFurnace)world.getTileEntity(x,y,z);
            return new ContainerEmeraldFurnace(player.inventory, tileEntityEmeraldFurnace);
        }

        return null;
    }
}
