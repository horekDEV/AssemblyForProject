package ru.horekdev.assemblyforproject.command;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                if (strings[0].equalsIgnoreCase("0")) {
                    player.setGameMode(GameMode.SURVIVAL);
                    return true;

                } else if (strings[0].equalsIgnoreCase("1")) {
                    player.setGameMode(GameMode.CREATIVE);
                    return true;

                } else if (strings[0].equalsIgnoreCase("2")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    return true;

                } else if (strings[0].equalsIgnoreCase("3")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    return true;
                }

            } else {
                player.sendMessage("You don't have permissions to use this command");
                return true;
            }
        } else {
            commandSender.sendMessage("this command can use only player!");
            return true;
        }

        return true;
    }
}
