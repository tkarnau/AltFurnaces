package com.tkarnau.altfurnaces.network;

import com.tkarnau.altfurnaces.network.message.MessageTileEntityAF;
import com.tkarnau.altfurnaces.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.LOWERCASE_MOD_ID);

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityAF.class, MessageTileEntityAF.class, 0, Side.CLIENT);
    }
}
