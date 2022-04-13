package me.tWizT3d_dreaMr.gpShopAddon;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.snowgears.shop.event.PlayerCreateShopEvent;

import me.ryanhamshire.GriefPrevention.Claim;
import me.ryanhamshire.GriefPrevention.GriefPrevention;


public class CheckOn implements Listener {

	 @EventHandler
	    public void onShopCreate(PlayerCreateShopEvent  e) {
		 Claim claim=GriefPrevention.instance.dataStore.getClaimAt(e.getShop().getChestLocation(), true, null);
		 if (claim == null) {
				e.setCancelled(true);;
			}
	 }

}
