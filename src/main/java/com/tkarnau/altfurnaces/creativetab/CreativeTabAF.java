package com.tkarnau.altfurnaces.creativetab;

import com.tkarnau.altfurnaces.init.ModItems;
import com.tkarnau.altfurnaces.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAF
{
    public static final CreativeTabs AF_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.ball;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Alt Furnaces";
        }
    };
}
