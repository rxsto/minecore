package me.rxsto.minecore

import me.rxsto.minecore.listeners.JoinListener
import me.rxsto.minecore.listeners.LeaveListener
import me.rxsto.minecore.listeners.MessageListener
import org.bukkit.plugin.java.JavaPlugin

class MineCore: JavaPlugin() {

    companion object {
        @JvmStatic
        lateinit var instance: MineCore
    }

    override fun onEnable() {
        instance = this
        logger.info("Successfully enabled MineCore!")
        server.pluginManager.registerEvents(JoinListener(), this)
        server.pluginManager.registerEvents(LeaveListener(), this)
        server.pluginManager.registerEvents(MessageListener(), this)
        saveDefaultConfig()
    }

    override fun onDisable() {
        logger.info("Successfully disabled MineCore!")
    }
}
