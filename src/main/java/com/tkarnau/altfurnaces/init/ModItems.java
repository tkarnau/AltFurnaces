package com.tkarnau.altfurnaces.init;

import com.tkarnau.altfurnaces.item.ItemAF;
import com.tkarnau.altfurnaces.item.ItemBall;
import com.tkarnau.altfurnaces.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemAF ball = new ItemBall();

    public static void init()
    {
        GameRegistry.registerItem(ball, "ball");
    }
}
