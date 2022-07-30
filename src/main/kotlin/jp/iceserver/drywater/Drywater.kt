package jp.iceserver.drywater

import jp.iceserver.drywater.commands.HubCommand

class Drywater : AbstractDrywater()
{
    companion object
    {
        lateinit var plugin: Drywater
    }
    override fun onEnable()
    {
        plugin = this

        registerCommands(
            HubCommand()
        )
    }
}