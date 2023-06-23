package ru.horekdev.assemblyforproject.mix.events.gameEvents;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;
import ru.horekdev.assemblyforproject.AssemblyForProject;

import java.util.Random;

public abstract class Rain {
    double change;

    public Rain(double change) {
        this.change = change;
    }

    public void start(long len) {
        Random random = new Random();

        new BukkitRunnable() {
            int count = 0;

            @Override
            public void run() {
                World world = (World) Bukkit.getWorlds().stream().filter(World::isNatural);

                for (Chunk chunk: world.getLoadedChunks()) {
                    for (int x = 0; x < 15; x++) {
                        for (int y = world.getMinHeight(); y < world.getMaxHeight(); y++) {
                            for (int z = 0; z < 15; z++) {
                                if (random.nextDouble() < len) {
                                    Location location = (Location) chunk.getBlock(x, y, z);
                                    showRain(location);
                                }
                            }
                        }
                    }
                }

                if (++count >= len) {
                    cancel();
                }
            }
        }.runTaskTimer(AssemblyForProject.getInstance(), 0L, 1L);
    }

    public abstract void showRain(Location location);
    public abstract void onLand(Location location);
}
