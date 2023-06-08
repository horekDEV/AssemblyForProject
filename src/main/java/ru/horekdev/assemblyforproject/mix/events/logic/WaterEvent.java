package ru.horekdev.assemblyforproject.mix.events.logic;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class WaterEvent implements Listener {
    @EventHandler
    public void onWater(PlayerMoveEvent event) {
        if (event.getPlayer().getLocation().getBlock().getType() == Material.WATER || event.getPlayer().getLocation().getBlock().getType() == Material.LEGACY_WATER) {
            event.getPlayer().setHealth(0);
        }
    }
}
