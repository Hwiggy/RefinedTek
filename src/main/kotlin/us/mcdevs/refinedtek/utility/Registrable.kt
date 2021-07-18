package us.mcdevs.refinedtek.utility

import net.minecraft.util.Identifier

/**
 * Contract interface for registered, namespaced elements.
 * @param[T] See [net.minecraft.util.registry.Registry]
 * @author Hwiggy
 * @version July 18, 2021
 */
interface Registrable<T> {
    /**
     * Registers this element using the provided [Identifier]
     * @param[id] The [Identifier] for this element
     * @return The generic [T] element that was registered
     */
    fun register(id: Identifier): T
}