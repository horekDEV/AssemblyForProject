package ru.horekdev.assemblyforproject.mix.events.logic;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class NoShiftEvent implements Listener {
    @EventHandler
    public void onSneak(PlayerMoveEvent event) {
        if (event.getPlayer().isSneaking()) {
            event.getPlayer().setHealth(0);
        }
    }
}
