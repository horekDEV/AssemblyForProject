package ru.horekdev.assemblyforproject.command.admins_commands.warp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.List;

public class WarpCMD implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                Warp.warps.stream()
                        .filter(warp -> warp.getWarpId().equals(strings[0]))
                        .findFirst().ifPresent(warp -> player.teleport(warp.getLocation()));

                player.sendMessage("you teleported on warp :)");
            }
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return null;
    }
}
