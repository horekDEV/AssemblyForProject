package ru.horekdev.assemblyforproject.mix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import ru.horekdev.assemblyforproject.util.ItemStackUtil;

public class MixMenu {
    public static MixMenu instance = new MixMenu();
    public final Inventory mixInventory = Bukkit.createInventory(null, 9, "mix");

    public MixMenu() {
        mixInventory.setItem(3, ItemStackUtil.createItemStack(Material.ANVIL, "server-settings", "server settings, it on and off flags and any more"));
        mixInventory.setItem(4, ItemStackUtil.createItemStack(Material.GRASS_BLOCK, "game-events", "gaming events, it add in minecraft new gameplay and many coll item"));
        mixInventory.setItem(5, ItemStackUtil.createItemStack(Material.BLACK_SHULKER_BOX, "???", "in development"));
    }
}
