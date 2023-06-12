package ru.horekdev.assemblyforproject.command;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.horekdev.assemblyforproject.util.TimeUtil;

import java.util.Date;

public class BanCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.isOp()) {
            if (Bukkit.getPlayer(strings[0]).isOp()) {
                player.sendMessage("You cant ban this player because he(she) is operator");
                return true;

            } else {
                long time = Long.parseLong(strings[2]);
                Date date = new Date(time);

                if (strings[2].substring(strings.length - 1).equalsIgnoreCase("min")) {
                    TimeUtil.minReturn(time);
                    Bukkit.getBanList(BanList.Type.NAME).addBan(strings[0], strings[1], date, null);
                    player.sendMessage("You ban player: " + Bukkit.getPlayer(strings[0]).getName());
                    return true;

                } else if (strings[2].substring(strings.length - 1).equalsIgnoreCase("h")) {
                    TimeUtil.hourReturn(time);
                    Bukkit.getBanList(BanList.Type.NAME).addBan(strings[0], strings[1], date, null);
                    player.sendMessage("You ban player: " + Bukkit.getPlayer(strings[0]).getName());
                    return true;

                } else if (strings[2].substring(strings.length - 1).equalsIgnoreCase("m")) {
                    TimeUtil.monthReturn(time);
                    Bukkit.getBanList(BanList.Type.NAME).addBan(strings[0], strings[1], date, null);
                    player.sendMessage("You ban player: " + Bukkit.getPlayer(strings[0]).getName());
                    return true;

                } else if (strings[2].substring(strings.length - 1).equalsIgnoreCase("d")) {
                    TimeUtil.dayReturn(time);
                    Bukkit.getBanList(BanList.Type.NAME).addBan(strings[0], strings[1], date, null);
                    player.sendMessage("You ban player: " + Bukkit.getPlayer(strings[0]).getName());
                    return true;
                }
            }
        } else {
            player.sendMessage("You don't have permissions to use this command");
            return true;
        }

        return true;
    }
}
