package ru.horekdev.assemblyforproject.mix.events.logic;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;
import ru.horekdev.assemblyforproject.AssemblyForProject;

public class RespawnEvent implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        new BukkitRunnable() {
            @Override
            public void run() {
                event.getEntity().spigot().respawn();
            }
        }.runTaskLater(AssemblyForProject.getInstance(), 1);
    }
}
