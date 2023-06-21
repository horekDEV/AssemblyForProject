package ru.horekdev.assemblyforproject.command.admins_commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.horekdev.assemblyforproject.mix.MixMenu;

public class Mix implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (player.isOp()) {
                player.openInventory(MixMenu.instance.mixInventory);
                return true;

            } else {
                player.sendMessage("You don't have permissions to use this command");
                return true;
            }
        }

        return true;
    }
}
