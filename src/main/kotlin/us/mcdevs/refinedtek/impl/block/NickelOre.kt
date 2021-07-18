package us.mcdevs.refinedtek.impl.block

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.block.Material
import net.minecraft.client.render.RenderLayer
import us.mcdevs.refinedtek.bootstrap.block.OreBlockBase
import us.mcdevs.refinedtek.bootstrap.item.BlockItemBase
import us.mcdevs.refinedtek.entrypoint.RefinedTek

class NickelOre private constructor() : OreBlockBase(
    RefinedTek.key("nickel_ore"),
    FabricBlockSettings.of(Material.STONE)
) {
    companion object {
        @JvmStatic val BLOCK = NickelOre()
        @JvmStatic val ITEM = BlockItemBase(BLOCK)
    }
}