package ru.horekdev.assemblyforproject.command.admins_commands.warp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.Collections;
import java.util.List;

public class WarpCMD implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            Warp.warps.stream()
                    .filter(warp -> warp.getWarpName().equals(strings[0]))
                    .findFirst().ifPresent(warp -> player.teleport(warp.getLocation()));

            player.sendMessage("you teleported on warp :)");
        } else {
            commandSender.sendMessage("Sorry, but this command can use only player");
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return Collections.singletonList(String.valueOf(Warp.warps));
    }
}
