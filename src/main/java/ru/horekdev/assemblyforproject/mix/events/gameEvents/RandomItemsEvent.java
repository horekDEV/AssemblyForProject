package ru.horekdev.assemblyforproject.mix.events.gameEvents;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import ru.horekdev.assemblyforproject.AssemblyForProject;

import java.util.Random;

public class RandomItemsEvent implements Listener {
    public void onGive(PlayerMoveEvent event) {
        new BukkitRunnable() {
            int count = 100;
            @Override
            public void run() {
                for (Player player: Bukkit.getOnlinePlayers()) {
                    Random random = new Random();
                    player.getInventory().addItem(new ItemStack(Material.values()[random.nextInt(Material.values().length - 1)]));
                }

                if (count <= 0) {
                    cancel();
                }
            }
        }.runTaskTimerAsynchronously(AssemblyForProject.getInstance(), 0L, 100L);
    }
}
