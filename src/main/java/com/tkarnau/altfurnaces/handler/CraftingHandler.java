package com.tkarnau.altfurnaces.handler;

import com.tkarnau.altfurnaces.utility.IOwnable;
import com.tkarnau.altfurnaces.utility.ItemHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class CraftingHandler
{
    public static void init()
    {

    }

    @SubscribeEvent
    public void onItemCraftedEvent(PlayerEvent.ItemCraftedEvent event)
    {
        if (event.crafting.getItem() instanceof IOwnable)
        {
            ItemHelper.setOwner(event.crafting, event.player);
        }
    }
}
