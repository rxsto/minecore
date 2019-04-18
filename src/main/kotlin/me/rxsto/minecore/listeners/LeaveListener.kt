package me.rxsto.minecore.listeners

import me.rxsto.minecore.MineCore
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class LeaveListener : Listener {

    @Suppress("unused")
    @EventHandler
    fun onPlayerJoinEvent(event: PlayerJoinEvent) {
        if (MineCore.instance.config.getBoolean("sendLeaveMessage"))
            event.player.world.players.forEach {
                it.sendMessage(
                    MineCore.instance.config.getString("leaveMessage")!!.format(
                        event.player.name
                    )
                )
            }
    }
}
