package ru.horekdev.assemblyforproject.command.admins_commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class TimeCMD implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                if (strings[0].equalsIgnoreCase("day")) {
                    Bukkit.getWorlds().stream().filter(World::isNatural).forEach(world -> world.setTime(100));

                } else if (strings[0].equalsIgnoreCase("night")) {
                    Bukkit.getWorlds().stream().filter(World::isNatural).forEach(world -> world.setTime(16000));
                }
            }
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of("day", "night");
    }
}
