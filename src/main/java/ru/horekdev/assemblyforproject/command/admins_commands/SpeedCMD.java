package ru.horekdev.assemblyforproject.command.admins_commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class SpeedCMD implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                if (strings[0].equalsIgnoreCase("1")) {
                    player.setFlySpeed(1);
                    player.setWalkSpeed(1);
                    player.sendMessage("Your speed is update {1}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("2")) {
                    player.setFlySpeed(2);
                    player.setWalkSpeed(2);
                    player.sendMessage("Your speed is update {2}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("3")) {
                    player.setFlySpeed(3);
                    player.setWalkSpeed(3);
                    player.sendMessage("Your speed is update {3}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("4")) {
                    player.setFlySpeed(4);
                    player.setWalkSpeed(4);
                    player.sendMessage("Your speed is update {4}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("5")) {
                    player.setFlySpeed(5);
                    player.setWalkSpeed(5);
                    player.sendMessage("Your speed is update {5}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("6")) {
                    player.setFlySpeed(6);
                    player.setWalkSpeed(6);
                    player.sendMessage("Your speed is update {6}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("7")) {
                    player.setFlySpeed(7);
                    player.setWalkSpeed(7);
                    player.sendMessage("Your speed is update {7)");
                    return true;

                } else if (strings[0].equalsIgnoreCase("8")) {
                    player.setFlySpeed(8);
                    player.setWalkSpeed(8);
                    player.sendMessage("Your speed is update {8}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("9")) {
                    player.setFlySpeed(9);
                    player.setWalkSpeed(9);
                    player.sendMessage("Your speed is update {9}");
                    return true;

                } else if (strings[0].equalsIgnoreCase("10")) {
                    player.setFlySpeed(10);
                    player.setWalkSpeed(10);
                    player.sendMessage("Your speed is update {10}");
                    return true;

                }
            } else {
                player.sendMessage("You don't have permissions to use this command");
            }
        } else {
            commandSender.sendMessage("Sorry, but this command can use only player");
            return true;
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
    }
}
