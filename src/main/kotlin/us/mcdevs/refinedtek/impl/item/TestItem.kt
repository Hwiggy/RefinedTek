package us.mcdevs.refinedtek.impl.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import us.mcdevs.refinedtek.utility.ItemBase

class TestItem(configurator: (FabricItemSettings) -> Unit) : ItemBase(configurator) {
    override fun isFireproof() = true
}