package com.darkstar.xpcraft;

import org.bukkit.plugin.java.JavaPlugin;

public class XPCraft extends JavaPlugin{
  public XPCraftBlocks Exp;
  public XPCraftCommand Com;

  public void onEnable(){
    getConfig().options().copyDefaults(true);
    saveConfig();

    this.Exp = new XPCraftBlocks(this);
    this.Com = new XPCraftCommand(this);

    getServer().getPluginManager().registerEvents(this.Exp, this);
    getServer().getPluginManager().registerEvents(this.Com, this);
  }
}