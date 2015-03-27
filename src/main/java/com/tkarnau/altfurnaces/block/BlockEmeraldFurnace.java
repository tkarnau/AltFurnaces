package com.tkarnau.altfurnaces.block;



import com.tkarnau.altfurnaces.AltFurnaces;
import com.tkarnau.altfurnaces.reference.GUIs;
import com.tkarnau.altfurnaces.reference.Reference;
import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;

import com.tkarnau.altfurnaces.utility.LogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.IIcon;

import net.minecraft.world.World;



public class BlockEmeraldFurnace extends BlockMultiTextureAF implements ITileEntityProvider
{

    public BlockEmeraldFurnace()
    {
        super();
        this.setBlockName("emeraldfurnace");
        this.setBlockTextureName("emeraldfurnace");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.iconFront = reg.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_front_off");
        this.iconTop = reg.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_top");
        this.iconLeft = reg.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())) + "_side");
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        //return side == meta ? this.iconFront : ((side == 0 || side == 1) ? this.iconTop : this.iconLeft);
        if (side == meta && meta != 0)
            return this.iconFront;
        else if (meta <= 0 || meta > 5) //e.g. in inventory
        {
            return getDefaultIcon(side);
        }
        else
        {
            if (side == 0 || side == 1)
            {
                return this.iconTop;
            }
            else
            {
                return this.iconLeft; // all sides
            }
        }
    }

    private IIcon getDefaultIcon(int side)
    {
        switch (side)
        {
            case 0:
            case 1:
                return this.iconTop;
            case 3:
                return this.iconFront;
            case 2:
            case 4:
            case 5:
                return this.iconLeft;
            default:
                return null;//dunno
        }
    }

    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileEntityEmeraldFurnace(0);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack)
    {

        super.onBlockPlacedBy(world, x, y, z, entityLivingBase, itemStack);

        if (itemStack.hasDisplayName())
        {
            ((TileEntityEmeraldFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(itemStack.getDisplayName());
        }

    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {

        if (world.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityEmeraldFurnace tileentityfurnace = (TileEntityEmeraldFurnace)world.getTileEntity(x, y, z);

            if (tileentityfurnace != null)
            {


                player.openGui(AltFurnaces.instance, GUIs.EMERALD_FURNACE.ordinal(), world, x, y, z);


            }

            return true;
        }
    }


}
