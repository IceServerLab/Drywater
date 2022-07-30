package jp.iceserver.drywater

class Drywater : AbstractDrywater()
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