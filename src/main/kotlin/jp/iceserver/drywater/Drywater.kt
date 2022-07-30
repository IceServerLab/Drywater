package jp.iceserver.drywater

import net.md_5.bungee.api.plugin.Plugin

class Drywater : Plugin()
{
    companion object
    {
        lateinit var plugin: Drywater
    }
    override fun onEnable()
    {
        plugin = this
    }
}