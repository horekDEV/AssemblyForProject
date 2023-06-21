package ru.horekdev.assemblyforproject.mix.events.between;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import ru.horekdev.assemblyforproject.mix.GameMenu;
import ru.horekdev.assemblyforproject.mix.MixMenu;
import ru.horekdev.assemblyforproject.mix.ServerSettingsMenu;

public class BetweenEvents implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getInventory().equals(MixMenu.instance.mixInventory)) {
            event.setCancelled(false);

            if (event.getSlot() == 3) {
                event.getWhoClicked().openInventory(ServerSettingsMenu.instance.serverInventory);

            } else if (event.getSlot() == 4) {
                event.getWhoClicked().openInventory(GameMenu.instance.gameInventory);

            } else if (event.getSlot() == 5) {
                event.getWhoClicked().sendMessage("this function in development and will be available on version 3.1");
            }
        }
    }
}
