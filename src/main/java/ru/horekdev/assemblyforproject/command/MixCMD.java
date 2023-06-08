package ru.horekdev.assemblyforproject.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import ru.horekdev.assemblyforproject.mix.GUISettings;

public class MixCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (player.isOp()) {
            player.openInventory(GUISettings.instance.settings);
            return true;
        }

        return true;
    }
}
