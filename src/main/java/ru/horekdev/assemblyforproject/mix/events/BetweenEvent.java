package ru.horekdev.assemblyforproject.mix.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import ru.horekdev.assemblyforproject.mix.GUIMix;
import ru.horekdev.assemblyforproject.mix.GUISettings;

public class BetweenEvent implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().equals(GUIMix.instance.mix)) {
            e.setCancelled(true);

            if (e.getSlot() == 4) {
                e.getWhoClicked().openInventory(GUISettings.instance.settings);
            }
        }
    }
}
