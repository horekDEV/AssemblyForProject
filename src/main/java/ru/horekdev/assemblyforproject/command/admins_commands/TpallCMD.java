package ru.horekdev.assemblyforproject.command.admins_commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpallCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                Bukkit.getOnlinePlayers().stream()
                        .filter(p -> !p.getUniqueId().equals(p.getUniqueId()))
                        .forEach(p -> p.teleport(player));

                player.sendMessage("All player teleported to you :)");
            } else {
                player.sendMessage("You don't have permissions to use this command");
                return true;
            }
        }

        return true;
    }
}
