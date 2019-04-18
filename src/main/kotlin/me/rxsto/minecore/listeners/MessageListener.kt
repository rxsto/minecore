package me.rxsto.minecore.listeners

import me.rxsto.minecore.MineCore
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class MessageListener : Listener {

    @Suppress("unused")
    @EventHandler
    fun onPlayerSendMessage(event: AsyncPlayerChatEvent) {
        event.player.world.players.forEach { it.sendMessage(MineCore.instance.config.getString("chatMessage")!!.format(event.player.name, event.message)) }
    }
}
