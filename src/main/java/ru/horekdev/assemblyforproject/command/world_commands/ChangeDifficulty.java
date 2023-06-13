package ru.horekdev.assemblyforproject.command.world_commands;

import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class ChangeDifficulty implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                World world = player.getWorld();

                if (args[0].equalsIgnoreCase("0")) {
                    world.setDifficulty(Difficulty.PEACEFUL);
                    player.sendMessage("World difficulty was update to PEACEFUL");
                    return true;

                } else if (args[0].equalsIgnoreCase("1")) {
                    world.setDifficulty(Difficulty.EASY);
                    player.sendMessage("World difficulty was update to EASY");
                    return true;

                } else if (args[0].equalsIgnoreCase("2")) {
                    world.setDifficulty(Difficulty.NORMAL);
                    player.sendMessage("World difficulty was update to NORMAL");
                    return true;

                } else if (args[0].equalsIgnoreCase("3")) {
                    world.setDifficulty(Difficulty.HARD);
                    player.sendMessage("World difficulty was update to HARD");
                    return true;
                }
            }
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of("0", "1", "2", "3");
    }
}
