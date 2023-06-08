package ru.horekdev.assemblyforproject.command;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class KillCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.isOp()) {
            if (Bukkit.getPlayer(strings[0]).isOp()) {
                player.sendMessage("You cant kill this player because he(she) is operator");
                return true;

            } else {
                Bukkit.getPlayer(strings[0]).setHealth(0);
                player.sendMessage("You kill player: " + Bukkit.getPlayer(strings[0]).getName());
                return true;
            }
        }

        return true;
    }
}
