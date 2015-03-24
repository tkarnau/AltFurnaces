package com.tkarnau.altfurnaces.utility;

import com.tkarnau.altfurnaces.reference.Reference;
import net.minecraft.util.ResourceLocation;

/*
    Direct from EE3 pahimar
 */
public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.LOWERCASE_MOD_ID, path);
    }
}
