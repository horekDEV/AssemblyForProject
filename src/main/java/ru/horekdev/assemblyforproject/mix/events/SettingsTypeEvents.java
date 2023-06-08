package ru.horekdev.assemblyforproject.mix.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import ru.horekdev.assemblyforproject.AssemblyForProject;
import ru.horekdev.assemblyforproject.mix.GUISettings;
import ru.horekdev.assemblyforproject.mix.events.logic.GameModeEvent;
import ru.horekdev.assemblyforproject.mix.events.logic.NoShiftEvent;
import ru.horekdev.assemblyforproject.mix.events.logic.RespawnEvent;
import ru.horekdev.assemblyforproject.mix.events.logic.WaterEvent;

public class SettingsTypeEvents implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().equals(GUISettings.instance.settings)) {
            e.setCancelled(true);

            if (e.getSlot() == 11) {
                if (e.getClick().isLeftClick()) {
                    Bukkit.getServer().getPluginManager().registerEvents(new RespawnEvent(), AssemblyForProject.getInstance());
                    e.getWhoClicked().sendMessage("auto-respawn was enable");

                } else if (e.getClick().isRightClick()) {
                    HandlerList.unregisterAll(new RespawnEvent());
                    e.getWhoClicked().sendMessage("auto-respawn was disable");

                } else if (e.getSlot() == 12) {
                    if (e.getClick().isLeftClick()) {
                        Bukkit.getServer().getPluginManager().registerEvents(new WaterEvent(), AssemblyForProject.getInstance());
                        e.getWhoClicked().sendMessage("now water = kill!");

                    } else if (e.getClick().isRightClick()) {
                        HandlerList.unregisterAll(new WaterEvent());
                        e.getWhoClicked().sendMessage("now water is normal");
                    }

                } else if (e.getSlot() == 13) {
                    if (e.getClick().isLeftClick()) {
                        Bukkit.getServer().getPluginManager().registerEvents(new GameModeEvent(), AssemblyForProject.getInstance());
                        e.getWhoClicked().sendMessage("auto-gm 3 was enable");

                    } else if (e.getClick().isRightClick()) {
                        HandlerList.unregisterAll(new GameModeEvent());
                        e.getWhoClicked().sendMessage("auto-gm 3 was disable");
                    }


                } else if (e.getSlot() == 14) {
                    for (Player player: Bukkit.getOnlinePlayers()) {
                        if (e.getClick().isLeftClick()) {
                            player.setMaxHealth(1);
                            player.setHealth(1);
                            e.getWhoClicked().sendMessage("now all players on server have 1 HP");

                        } else if (e.getClick().isRightClick()) {
                            player.setMaxHealth(10);
                            player.setHealth(10);
                            e.getWhoClicked().sendMessage("now players HP is normal");
                        }
                    }

                } else if (e.getSlot() == 15) {
                    if (e.getClick().isLeftClick()) {
                        Bukkit.getServer().getPluginManager().registerEvents(new NoShiftEvent(), AssemblyForProject.getInstance());
                        e.getWhoClicked().sendMessage("shift = dead!");

                    } else if (e.getClick().isRightClick()) {
                        HandlerList.unregisterAll(new NoShiftEvent());
                        e.getWhoClicked().sendMessage("you can shift again");
                    }
                }
            }
        }
    }
}
