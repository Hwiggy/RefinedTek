package us.mcdevs.refinedtek.bootstrap.item

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import us.mcdevs.refinedtek.bootstrap.Identifiable

class ItemBase @JvmOverloads constructor(
    override val identifier: Identifier,
    configurator: (FabricItemSettings) -> Unit = {}
) : Item(FabricItemSettings().also(configurator)), Identifiable