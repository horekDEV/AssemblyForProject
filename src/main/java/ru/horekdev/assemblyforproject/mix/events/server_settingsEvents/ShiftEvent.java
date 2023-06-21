package ru.horekdev.assemblyforproject.mix.events.server_settingsEvents;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ShiftEvent implements Listener {
    @EventHandler
    public void onSneak(PlayerMoveEvent event) {
        if (event.getPlayer().isSneaking()) {
            event.getPlayer().setHealth(0);
        }
    }
}
