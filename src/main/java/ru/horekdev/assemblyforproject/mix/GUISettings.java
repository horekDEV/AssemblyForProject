package ru.horekdev.assemblyforproject.mix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import ru.horekdev.assemblyforproject.util.ItemStackUtil;

public class GUISettings {
    public static final GUISettings instance = new GUISettings();
    public Inventory settings = Bukkit.createInventory(null, 27, "Server settings");

    public GUISettings() {
        for (int i = 0; i < settings.getSize(); i++) {
            settings.setItem(i, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        }

        settings.setItem(11, ItemStackUtil.createItemStack(Material.WATER_BUCKET, "WaterDamage", "water = kill"));
        settings.setItem(12, ItemStackUtil.createItemStack(Material.GRASS_BLOCK, "NO SHIFT!", "if player shifting then he(she) dead"));
        settings.setItem(13, ItemStackUtil.createItemStack(Material.SKELETON_SKULL, "AUTO RESPAWN", "auto respawn before death"));
        settings.setItem(14, ItemStackUtil.createItemStack(Material.APPLE, "1 HP", "doing one hp all player on server"));
        settings.setItem(15, ItemStackUtil.createItemStack(Material.FEATHER, "AUTO GM3", "doing auto gamemode spectator before death"));
    }
}
