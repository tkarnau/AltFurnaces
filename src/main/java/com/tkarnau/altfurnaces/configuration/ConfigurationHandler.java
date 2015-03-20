package com.tkarnau.altfurnaces.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();
            //read in properties from config
        }
        catch (Exception e)
        {
            //log exception
        }
        finally
        {
            configuration.save();
        }
    }
}
