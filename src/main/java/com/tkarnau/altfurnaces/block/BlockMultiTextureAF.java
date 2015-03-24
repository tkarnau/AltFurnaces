package com.tkarnau.altfurnaces.block;



import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public abstract class BlockMultiTextureAF extends BlockAF
{
    @SideOnly(Side.CLIENT)
    protected IIcon iconFront;

    @SideOnly(Side.CLIENT)
    protected IIcon iconTop;

    @SideOnly(Side.CLIENT)
    protected IIcon iconBottom;

    @SideOnly(Side.CLIENT)
    protected IIcon iconLeft;

    @SideOnly(Side.CLIENT)
    protected IIcon iconRight;

    @SideOnly(Side.CLIENT)
    protected IIcon iconBack;

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack)
    {
        int l = MathHelper.floor_double((entityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }
        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
}
