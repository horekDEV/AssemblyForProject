package ru.horekdev.assemblyforproject;

import org.bukkit.plugin.java.JavaPlugin;
import ru.horekdev.assemblyforproject.command.admins_commands.*;
import ru.horekdev.assemblyforproject.command.admins_commands.warp.Warp;
import ru.horekdev.assemblyforproject.command.world_commands.GameModeCMD;
import ru.horekdev.assemblyforproject.command.world_commands.SetSpawnCMD;
import ru.horekdev.assemblyforproject.mix.events.OnEvents;
import ru.horekdev.assemblyforproject.mix.events.between.BetweenEvents;

public final class AssemblyForProject extends JavaPlugin {
    public static AssemblyForProject instance;

    public static AssemblyForProject getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Warp.loadWarp();

        getLogger().info("Plugin " + getDescription().getName() + " was enable");
        getLogger().info("made by " + getDescription().getAuthors());

        getCommand("kick").setExecutor(new KickCMD());
        getCommand("kill").setExecutor(new KillCMD());
        getCommand("ban").setExecutor(new BanCMD());
        getCommand("speed").setExecutor(new SpeedCMD());
        getCommand("setSpawn").setExecutor(new SetSpawnCMD());
        getCommand("tpall").setExecutor(new TpallCMD());
        getCommand("gm").setExecutor(new GameModeCMD());
        getCommand("mix").setExecutor(new Mix());
        getCommand("t").setExecutor(new TimeCMD());

        getServer().getPluginManager().registerEvents(new OnEvents(), this);
        getServer().getPluginManager().registerEvents(new BetweenEvents(), this);
    }

    @Override
    public void onDisable() {
        instance = null;

        getLogger().info("Plugin " + getDescription().getName() + " was enable");
        getLogger().info("made by " + getDescription().getAuthors());

    }
}
