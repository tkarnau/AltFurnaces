package com.tkarnau.altfurnaces.reference;


import com.tkarnau.altfurnaces.utility.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public final class Textures
{
    public static final class Gui
    {
        protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";
        public static final ResourceLocation EMERALDFURNACE = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "emeraldfurnace.png");

        public static final class Elements
        {
            protected static final String ELEMENT_TEXTURE_LOCATION = GUI_TEXTURE_LOCATION + "elements/";
        }
    }
}
