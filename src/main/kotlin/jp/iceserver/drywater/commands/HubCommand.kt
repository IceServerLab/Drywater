package jp.iceserver.drywater.commands

import jp.iceserver.drywater.Drywater
import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.connection.ProxiedPlayer
import net.md_5.bungee.api.plugin.Command

class HubCommand : Command("hub")
{
    override fun execute(sender: CommandSender, args: Array<out String>)
    {
        sender as ProxiedPlayer
        sender.connect(Drywater.plugin.proxy.getServerInfo("lobby"))
    }
}