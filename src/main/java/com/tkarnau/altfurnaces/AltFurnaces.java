package com.tkarnau.altfurnaces;

import com.tkarnau.altfurnaces.handler.ConfigurationHandler;
import com.tkarnau.altfurnaces.handler.GuiHandler;
import com.tkarnau.altfurnaces.init.ModBlocks;
import com.tkarnau.altfurnaces.init.ModItems;
import com.tkarnau.altfurnaces.init.ModTileEntities;
import com.tkarnau.altfurnaces.init.Recipes;
import com.tkarnau.altfurnaces.network.PacketHandler;
import com.tkarnau.altfurnaces.proxy.IProxy;
import com.tkarnau.altfurnaces.reference.Reference;
import com.tkarnau.altfurnaces.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

import java.sql.Ref;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AltFurnaces
{

    @Mod.Instance(Reference.MOD_ID)
    public static AltFurnaces instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        PacketHandler.init();

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        LogHelper.info("Pre Initialization Complete!");

        ModItems.init();

        ModBlocks.init();


    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Register the GUI Handler
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        ModTileEntities.init();

        // Initialize custom rendering and pre-load textures (Client only)
        proxy.initRenderingAndTextures();

        // Register the Items Event Handler
        proxy.registerEventHandlers();

        Recipes.init();

        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }

}
