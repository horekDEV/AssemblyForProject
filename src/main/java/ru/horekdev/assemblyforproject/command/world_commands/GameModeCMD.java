package ru.horekdev.assemblyforproject.command.world_commands;

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
                    player.sendMessage("Your gamemode was update");
                    return true;

                } else if (strings[0].equalsIgnoreCase("1")) {
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendMessage("Your gamemode was update");
                    return true;

                } else if (strings[0].equalsIgnoreCase("2")) {
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendMessage("Your gamemode was update");
                    return true;

                } else if (strings[0].equalsIgnoreCase("3")) {
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendMessage("Your gamemode was update");
                    return true;
                }

            } else {
                player.sendMessage("You don't have permissions to use this command");
                return true;
            }
        } else {
            commandSender.sendMessage("Sorry, but this command can use only player");
            return true;
        }

        return true;
    }
}
