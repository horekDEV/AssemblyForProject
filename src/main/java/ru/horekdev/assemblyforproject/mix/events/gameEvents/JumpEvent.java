package ru.horekdev.assemblyforproject.mix.events.gameEvents;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class JumpEvent implements Listener {
    @EventHandler
    public void onJump(PlayerMoveEvent event) {
        if (event.getPlayer().getVelocity().getY() >= 0 && !event.getPlayer().isOnGround()) {
            event.getPlayer().setHealth(0);
        }
    }
}
