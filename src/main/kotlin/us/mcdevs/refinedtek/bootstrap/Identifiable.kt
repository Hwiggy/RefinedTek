package us.mcdevs.refinedtek.bootstrap

import net.minecraft.util.Identifier

/**
 * Marks a class as needing an [Identifier] for a [net.minecraft.util.registry.Registry]
 *
 * @author Hwiggy
 * @version July 18, 2021
 */
interface Identifiable {
    /**
     * The [Identifier] used to register this element
     */
    val identifier: Identifier
}