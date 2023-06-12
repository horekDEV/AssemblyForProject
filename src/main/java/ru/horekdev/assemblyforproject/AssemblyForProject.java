package ru.horekdev.assemblyforproject;

import org.bukkit.plugin.java.JavaPlugin;
import ru.horekdev.assemblyforproject.command.*;

public final class AssemblyForProject extends JavaPlugin {
    public static AssemblyForProject instance;

    public static AssemblyForProject getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("Plugin " + getDescription().getName() + " was enable");
        getLogger().info("made by " + getDescription().getAuthors());

        getCommand("kick").setExecutor(new KickCMD());
        getCommand("kill").setExecutor(new KillCMD());
        getCommand("ban").setExecutor(new BanCMD());
        getCommand("speed").setExecutor(new FlySpeedCMD());
        getCommand("setSpawn").setExecutor(new SetSpawnCMD());
        getCommand("tpall").setExecutor(new TpallCMD());
        getCommand("gm").setExecutor(new GameModeCMD());
    }

    @Override
    public void onDisable() {
        instance = null;

        getLogger().info("Plugin " + getDescription().getName() + " was enable");
        getLogger().info("made by " + getDescription().getAuthors());

    }
}
