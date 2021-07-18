package us.mcdevs.refinedtek.bootstrap

import net.minecraft.util.registry.Registry

/**
 * Marks a class as responsible for registering an [Identifiable] to a [Registry]
 *
 * @author Hwiggy
 * @version July 18, 2021
 */
object Registrar {
    /**
     * Registers the [Identifiable] to the provided [Registry]
     * @param[I] Generic bound for the type of [Identifiable] being registered
     * @param[O] Generic bound for the type being returned from the registry
     * @param[identifiable] The element being registered
     * @param[registry] The [Registry] the element will be registered to
     * @return[O] The element that was registered, with its type erased
     */
    fun <I : Identifiable, O> register(identifiable: I, registry: Registry<O>): O {
        return Registry.register(registry, identifiable.identifier, identifiable as O)
    }
}