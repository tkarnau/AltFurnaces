package com.tkarnau.altfurnaces.init;

import com.tkarnau.altfurnaces.item.ItemAF;
import com.tkarnau.altfurnaces.item.ItemBall;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemAF ball = new ItemBall();

    public static void init()
    {
        GameRegistry.registerItem(ball, "ball");
    }
}
