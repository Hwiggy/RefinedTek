package us.mcdevs.refinedtek.entrypoint

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import us.mcdevs.refinedtek.bootstrap.Registrar
import us.mcdevs.refinedtek.impl.block.NickelOre

object RefinedTek : ModInitializer {
    @JvmStatic val LOGGER = LogManager.getLogger("RefinedTek")
    override fun onInitialize() {
        LOGGER.log(Level.INFO, "Welcome to RefinedTek!")

        Registrar.register(NickelOre.BLOCK, Registry.BLOCK)
        Registrar.register(NickelOre.ITEM, Registry.ITEM)
    }

    @JvmStatic val MOD_ID = "refinedtek"
    @JvmStatic fun key(key: String) = Identifier(MOD_ID, key)
}