package com.tkarnau.altfurnaces.block;



import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IIconRegister;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;

import net.minecraft.world.World;



public class BlockEmeraldFurnace extends BlockMultiTextureAF
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
        return side == meta ? this.iconFront : ((side == 0 || side == 1) ? this.iconTop : this.iconLeft);

    }

    public TileEntity createNewTileEntity(World world)
    {
        return new TileEntityEmeraldFurnace();
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


}
