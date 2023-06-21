package ru.horekdev.assemblyforproject.mix.events.server_settingsEvents;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class GamemodeEvent implements Listener {
    @EventHandler
    public void onDead(PlayerDeathEvent event) {
        if (event.getEntity().isDead()) {
            event.getEntity().setGameMode(GameMode.SPECTATOR);
        }
    }
}
