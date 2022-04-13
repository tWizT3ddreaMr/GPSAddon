package me.tWizT3d_dreaMr.gpShopAddon;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
public void onEnable()  {
	Bukkit.getPluginManager().registerEvents(new CheckOn(),this);
}
}