package us.mcdevs.refinedtek.bootstrap.block

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.OreBlock
import net.minecraft.util.Identifier
import us.mcdevs.refinedtek.bootstrap.Identifiable

open class OreBlockBase(
    override val identifier: Identifier,
    settings: FabricBlockSettings
) : OreBlock(settings), Identifiable