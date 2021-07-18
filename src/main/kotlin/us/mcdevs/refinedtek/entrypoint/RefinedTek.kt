package us.mcdevs.refinedtek.entrypoint

import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager

object RefinedTek : ModInitializer {
    @JvmStatic val LOGGER = LogManager.getLogger("RefinedTek")
    override fun onInitialize() {
        LOGGER.log(Level.INFO, "Welcome to RefinedTek!")
    }

    @JvmStatic val MOD_ID = "refinedtek"
    @JvmStatic fun key(key: String) = Identifier(MOD_ID, key)
}