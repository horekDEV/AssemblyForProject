package ru.horekdev.assemblyforproject.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpallCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.isOp()) {
            for (Player online: Bukkit.getOnlinePlayers()) {
                player.teleport(online.getLocation());
                player.sendMessage("All players teleported to you");
                return true;
            }
        }

        return true;
    }
}
