package com.tkarnau.altfurnaces.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class Recipes
{
    public static void init()
    {
        //items
        GameRegistry.addRecipe(new ItemStack(ModItems.ball),
                " s ",
                "sss",
                " s ",
                's', new ItemStack(Items.slime_ball));

        //blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.emeraldfurnace),
                "eee",
                "ese",
                "eee",
                'e', new ItemStack(Items.emerald),
                's', new ItemStack(Blocks.cobblestone)
        );
    }
}
