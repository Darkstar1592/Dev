package com.darkstar.xpcraft;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class XPCraftCommand implements Listener{
  public XPCraft plugin;

  public XPCraftCommand(XPCraft plugin)
  {
    this.plugin = plugin;
  }

  @EventHandler(priority=EventPriority.LOWEST)
  public void PlayerCommand(PlayerCommandPreprocessEvent e)
  {
    Player p = e.getPlayer();
    String msg = e.getMessage();
    String[] args = msg.split(" ");
    if (p.isOp())
    {
      if (args[0].equalsIgnoreCase("/xpcraft")) {
        e.setCancelled(true);

        this.plugin.reloadConfig();
        p.sendMessage(ChatColor.GREEN + "[XPCraft] Reload Complete");
      }
    }
  }
}