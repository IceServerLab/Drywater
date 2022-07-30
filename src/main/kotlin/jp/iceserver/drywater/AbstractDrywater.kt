package jp.iceserver.drywater

import net.md_5.bungee.api.plugin.Command
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.api.plugin.Plugin
import net.md_5.bungee.api.plugin.TabExecutor

abstract class AbstractDrywater : Plugin()
{
    /**
     * イベントリスナーを登録
     *
     * @param listeners Listenerを実装しているクラス
     */
    protected fun registerListeners(vararg listeners: Listener)
    {
        listeners.forEach { proxy.pluginManager.registerListener(this, it) }
    }

    /**
     * コマンドを登録
     *
     * @param commands CommandExecutorを継承しているクラスとそのコマンド名前
     */
    protected fun registerCommands(vararg commands: Command)
    {
        commands.forEach { proxy.pluginManager.registerCommand(this, it) }
    }
}