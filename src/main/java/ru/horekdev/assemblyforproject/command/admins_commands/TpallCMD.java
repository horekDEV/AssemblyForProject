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
                for (Player online: Bukkit.getOnlinePlayers()) {
                    online.teleport(player.getLocation());
                    player.sendMessage("All players teleported to you");
                    return true;
                }
            }
        }

        return true;
    }
}
