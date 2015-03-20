package com.tkarnau.altfurnaces;

import com.tkarnau.altfurnaces.configuration.ConfigurationHandler;
import com.tkarnau.altfurnaces.proxy.IProxy;
import com.tkarnau.altfurnaces.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AltFurnaces
{

    @Mod.Instance(Reference.MOD_ID)
    public static AltFurnaces instance;

    @SidedProxy(clientSide = "com.tkarnau.altfurnaces.proxy.ClientProxy", serverSide = "com.tkarnau.altfurnaces.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
