package ru.horekdev.assemblyforproject.command.admins_commands.warp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import ru.horekdev.assemblyforproject.AssemblyForProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Warp {
    private String warpId;
    private String warpName;
    private Location location;
    public static List<Warp> warps = new ArrayList<>();

    public Warp(String warpId, String warpName, Location location) {
        this.warpId = warpId;
        this.warpName = warpName;
        this.location = location;
    }

    public String getWarpId() {
        return warpId;
    }

    public void setWarpId(String warpId) {
        this.warpId = warpId;
    }

    public String getWarpName() {
        return warpName;
    }

    public void setWarpName(String warpName) {
        this.warpName = warpName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static void loadWarp() {
        for (String key: AssemblyForProject.getInstance().getConfig().getKeys(false)) {
            String warpName = AssemblyForProject.getInstance().getConfig().getString(key + ".name");
            World world = Bukkit.getWorld(Objects.requireNonNull(AssemblyForProject.getInstance().getConfig().getString(key + ".location.world")));

            int x = AssemblyForProject.getInstance().getConfig().getInt(key + ".location.x");
            int y = AssemblyForProject.getInstance().getConfig().getInt(key + ".location.y");
            int z = AssemblyForProject.getInstance().getConfig().getInt(key + ".location.z");

            Location currentLocation = new Location(world, x, y, z);
        }
    }
}
