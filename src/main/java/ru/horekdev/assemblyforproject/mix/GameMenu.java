package ru.horekdev.assemblyforproject.mix;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import ru.horekdev.assemblyforproject.util.ItemStackUtil;

public class GameMenu {
    public static GameMenu instance = new GameMenu();
    public final Inventory gameInventory = Bukkit.createInventory(null, 27, "game-settings");

    public GameMenu() {
        for (int i = 0; i < gameInventory.getSize(); i++) {
            gameInventory.setItem(i, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
        }
        gameInventory.setItem(11, ItemStackUtil.createItemStack(Material.BUCKET, "apocalypse rain","this is rain from fireball!!!, RUN RUN RUN" ));
        gameInventory.setItem(12, ItemStackUtil.createItemStack(Material.DIAMOND_BOOTS, "NO JUMP", "if player jump, he(she) dead!!"));
        gameInventory.setItem(13, ItemStackUtil.createItemStack(Material.GOLDEN_APPLE, "random items", "random items give was start!"));
        gameInventory.setItem(14, ItemStackUtil.createItemStack(Material.WATER, "water damage", "now water is damage you, don't touch her"));
        gameInventory.setItem(15, ItemStackUtil.createItemStack(Material.BLUE_CONCRETE, "random blocks give", "if you break block, it drop random block"));
    }
}
