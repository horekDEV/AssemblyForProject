package ru.horekdev.assemblyforproject.mix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import ru.horekdev.assemblyforproject.util.ItemStackUtil;

public class GUIMix {
    public static final GUIMix instance = new GUIMix();
    public Inventory mix = Bukkit.createInventory(null, 9, "MIX");

    public GUIMix() {
        mix.setItem(4, ItemStackUtil.createItemStack(Material.ANVIL, "server setting", "settings server flags and more..."));
    }
}
