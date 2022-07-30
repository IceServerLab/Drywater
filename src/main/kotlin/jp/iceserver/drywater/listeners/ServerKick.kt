package jp.iceserver.drywater.listeners

import jp.iceserver.drywater.Drywater
import net.md_5.bungee.api.event.ServerKickEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler
import net.md_5.bungee.event.EventPriority

class ServerKick : Listener
{
    @EventHandler (priority = EventPriority.HIGHEST)
    fun onServerKick(e: ServerKickEvent)
    {
        e.cancelServer = Drywater.plugin.proxy.getServerInfo("lobby")
        e.kickReasonComponent.forEach { e.player.sendMessage(it) }
        e.isCancelled = true
    }
}