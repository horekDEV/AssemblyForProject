package ru.horekdev.assemblyforproject.mix.events.logic;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class GameModeEvent implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        if (event.getEntity().isDead()) {
            event.getEntity().setGameMode(GameMode.SPECTATOR);
        }
    }
}
