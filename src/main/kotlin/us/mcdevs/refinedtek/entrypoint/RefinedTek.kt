package us.mcdevs.refinedtek.entrypoint

import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.LogManager
import us.mcdevs.refinedtek.impl.item.TestItem
import us.mcdevs.refinedtek.utility.ItemBase

object RefinedTek : ModInitializer {
    @JvmStatic val ID = "refinedtek"
    @JvmStatic val LOGGER = LogManager.getLogger(ID)

    override fun onInitialize() {
        LOGGER.log(Level.INFO, "Welcome to RefinedTek!")
        listOf<Pair<ItemBase, Identifier>>(
            TestItem { it.group(ItemGroup.MISC) } to key("test_item")
        ).forEach { (item, id) -> item.register(id) }
    }

    @JvmStatic fun key(key: String) = Identifier(ID, key)
}