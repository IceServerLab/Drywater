package jp.iceserver.drywater

import jp.iceserver.drywater.commands.*
import jp.iceserver.drywater.listeners.*

class Drywater : AbstractDrywater()
{
    companion object
    {
        lateinit var plugin: Drywater
    }
    override fun onEnable()
    {
        plugin = this

        registerListeners(
            ServerKick()
        )

        registerCommands(
            HubCommand()
        )
    }
}