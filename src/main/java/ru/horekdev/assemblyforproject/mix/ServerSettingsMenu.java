package ru.horekdev.assemblyforproject.mix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import ru.horekdev.assemblyforproject.util.ItemStackUtil;

public class ServerSettingsMenu {
    public static ServerSettingsMenu instance = new ServerSettingsMenu();
    public final Inventory serverInventory = Bukkit.createInventory(null, 27, "server-settings");

    public ServerSettingsMenu() {
        for (int i = 0; i < serverInventory.getSize(); i++) {
            serverInventory.setItem(i, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        }
        serverInventory.setItem(11, ItemStackUtil.createItemStack(Material.FEATHER, "auto gamemode 3", "if player dead, his gamemode was update to spectator"));
        serverInventory.setItem(12, ItemStackUtil.createItemStack(Material.ARMOR_STAND, "auto respawn", "if player is dead, he respawning before 0.0001 second!"));
        serverInventory.setItem(13, ItemStackUtil.createItemStack(Material.WOODEN_SWORD, "pvp", "pvp on or off in world?"));
        serverInventory.setItem(14, ItemStackUtil.createItemStack(Material.FLOWERING_AZALEA, "shift = kill", "if player shifting, he(she) dead!"));
        serverInventory.setItem(15, ItemStackUtil.createItemStack(Material.PAPER, "whitelist", "in development"));
    }
}
