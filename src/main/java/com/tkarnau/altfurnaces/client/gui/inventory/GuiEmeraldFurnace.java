package com.tkarnau.altfurnaces.client.gui.inventory;

import com.tkarnau.altfurnaces.inventory.ContainerEmeraldFurnace;
import com.tkarnau.altfurnaces.reference.Textures;
import com.tkarnau.altfurnaces.tileentity.TileEntityEmeraldFurnace;
import com.tkarnau.altfurnaces.utility.LogHelper;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;
import org.lwjgl.opengl.GL11;

public class GuiEmeraldFurnace extends GuiContainer
{
    //private TileEntityAlchemicalChest tileEntityAlchemicalChest;
    TileEntityEmeraldFurnace tileEntityEmeraldFurnace;

    public GuiEmeraldFurnace(InventoryPlayer inventoryPlayer, TileEntityEmeraldFurnace tileEntityEmeraldFurnace)
    {
        super(new ContainerEmeraldFurnace(inventoryPlayer, tileEntityEmeraldFurnace));

        this.tileEntityEmeraldFurnace = tileEntityEmeraldFurnace;


    }

    @Override
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        //fontRendererObj.drawString(StatCollector.translateToLocal(Names.Containers.VANILLA_INVENTORY), 35, ySize - 95 + 2, Integer.parseInt(Colors.PURE_WHITE, 16));

        this.fontRendererObj.drawString("TEST", 8, this.ySize - 96 + 2, 4210752);
    }



    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);


        this.mc.getTextureManager().bindTexture(Textures.Gui.EMERALDFURNACE);
        LogHelper.info("drawing emerald furnace");

        int xStart = (width - xSize) / 2;
        int yStart = (height - ySize) / 2;
        this.drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);
    }
}
