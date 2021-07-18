package us.mcdevs.refinedtek.bootstrap.block

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.util.Identifier
import us.mcdevs.refinedtek.bootstrap.Identifiable

class BlockBase (
    override val identifier: Identifier,
    settings: FabricBlockSettings
) : Block(settings), Identifiable