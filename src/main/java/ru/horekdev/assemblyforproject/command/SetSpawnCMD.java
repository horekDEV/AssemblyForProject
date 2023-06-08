package ru.horekdev.assemblyforproject.command;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawnCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        World world = player.getWorld();

        if (player.isOp()) {
            world.setSpawnLocation(player.getLocation());
            player.sendMessage("You update spawn location in this world!");
            return true;

        } else {
            player.sendMessage("You don't have permissions to use this command");
            return true;
        }
    }
}
