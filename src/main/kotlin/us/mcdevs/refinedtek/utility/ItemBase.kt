package us.mcdevs.refinedtek.utility

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

/**
 * Base class for Items defined by RefinedTek.
 * Constructor allows the optional inline configuration of [FabricItemSettings]
 *
 * @author Hwiggy
 * @version July 18, 2021
 */
open class ItemBase @JvmOverloads constructor(
    configurator: (FabricItemSettings) -> Unit = {}
) : Item(FabricItemSettings().also(configurator)), Registrable<Item> {

    /**
     * Registers this [Item] to the item registry with the specified identifier.
     */
    override fun register(id: Identifier): Item = Registry.register(Registry.ITEM, id, this)
}