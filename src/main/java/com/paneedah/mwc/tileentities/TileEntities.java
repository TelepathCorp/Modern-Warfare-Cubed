package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Guns;
import com.paneedah.weaponlib.tile.CustomTileEntityBlock;
import com.paneedah.weaponlib.tile.LootBoxConfiguration;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import org.lwjgl.opengl.GL11;

public class TileEntities {

    public static void init(CommonProxy commonProxy) {
		new TurretBaseFactory().createTileEntity(MWC.modContext);

	}
}
