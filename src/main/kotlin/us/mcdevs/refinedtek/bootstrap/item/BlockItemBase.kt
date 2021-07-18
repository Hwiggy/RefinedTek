package us.mcdevs.refinedtek.bootstrap.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import us.mcdevs.refinedtek.bootstrap.Identifiable
import us.mcdevs.refinedtek.bootstrap.block.BlockBase
import us.mcdevs.refinedtek.bootstrap.block.OreBlockBase

class BlockItemBase : BlockItem, Identifiable {
    override val identifier: Identifier

    @JvmOverloads constructor(
        base: BlockBase,
        configurator: (FabricItemSettings) -> Unit = {}
    ) : super(base, FabricItemSettings().also(configurator)) {
        this.identifier = base.identifier
    }

    @JvmOverloads constructor(
        base: OreBlockBase,
        configurator: (FabricItemSettings) -> Unit = {}
    ) : super(base, FabricItemSettings().also(configurator)) {
        this.identifier = base.identifier
    }
}