package ru.horekdev.assemblyforproject.mix.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import ru.horekdev.assemblyforproject.AssemblyForProject;
import ru.horekdev.assemblyforproject.mix.ServerSettingsMenu;
import ru.horekdev.assemblyforproject.mix.events.gameEvents.BlockRandomEvent;
import ru.horekdev.assemblyforproject.mix.events.gameEvents.JumpEvent;
import ru.horekdev.assemblyforproject.mix.events.gameEvents.RandomItemsEvent;
import ru.horekdev.assemblyforproject.mix.events.gameEvents.WaterEvent;
import ru.horekdev.assemblyforproject.mix.events.gameEvents.Rain;
import ru.horekdev.assemblyforproject.mix.events.server_settingsEvents.GamemodeEvent;
import ru.horekdev.assemblyforproject.mix.events.server_settingsEvents.RespawnEvent;
import ru.horekdev.assemblyforproject.mix.events.server_settingsEvents.ShiftEvent;

public class OnEvents implements Listener {
    @EventHandler
    public void onClickServer(InventoryClickEvent event) {
        if (event.getInventory().equals(ServerSettingsMenu.instance.serverInventory)) {
            event.setCancelled(false);

            if (event.getSlot() == 11) {
                if (event.getClick().isLeftClick()) {
                    Bukkit.getServer().getPluginManager().registerEvents(new GamemodeEvent(), AssemblyForProject.getInstance());
                    event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a auto-gamemode was enable!"));

                } else if (event.getClick().isRightClick()) {
                    HandlerList.unregisterAll(new GamemodeEvent());
                    event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4 auto-gamemode was disable!"));
                }


            } else if (event.getSlot() == 12) {
                if (event.getClick().isLeftClick()) {
                    Bukkit.getServer().getPluginManager().registerEvents(new RespawnEvent(), AssemblyForProject.getInstance());
                    event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a auto-respawn was enable!"));

                } else if (event.getClick().isRightClick()) {
                    HandlerList.unregisterAll(new RespawnEvent());
                    event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4 auto-respawn was disable!"));
                }

            } else if (event.getSlot() == 14) {
                if (event.getClick().isLeftClick()) {
                    Bukkit.getServer().getPluginManager().registerEvents(new ShiftEvent(), AssemblyForProject.getInstance());
                    event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&a NO SHIFT was enable!"));

                } else if (event.getClick().isRightClick()) {
                    HandlerList.unregisterAll(new ShiftEvent());
                    event.getWhoClicked().sendMessage(ChatColor.translateAlternateColorCodes('&', "&4 NO SHIFT was disable!"));
                }

            } else if (event.getSlot() == 13) {
                World world = event.getWhoClicked().getWorld();

                if (event.getClick().isLeftClick()) {
                    world.setPVP(false);

                } else if (event.getClick().isRightClick()) {
                    world.setPVP(true);
                }

            } else if (event.getSlot() == 15) {
                event.getWhoClicked().sendMessage("this function in development and will be available on version 2.1");
            }
        }
    }

    @EventHandler
    public void onClickGame(InventoryClickEvent event) {
        if (event.getSlot() == 11) {
            if (event.getClick().isLeftClick()) {
                new Rain(0.000001) {
                    @Override
                    public void showRain(Location location) {
                        Fireball fireball = location.getWorld().spawn(location, Fireball.class);
                    }

                    @Override
                    public void onLand(Location location) {}
                }.start(1200);
            }

        } else if (event.getSlot() == 12) {
           if (event.getClick().isLeftClick()) {
               Bukkit.getServer().getPluginManager().registerEvents(new JumpEvent(), AssemblyForProject.getInstance());
           } else if (event.getClick().isRightClick()) {
               HandlerList.unregisterAll(new JumpEvent());
           }

        } else if (event.getSlot() == 13) {
            if (event.getClick().isLeftClick()) {
                Bukkit.getServer().getPluginManager().registerEvents(new RandomItemsEvent(), AssemblyForProject.getInstance());
            } else if (event.getClick().isRightClick()) {
                HandlerList.unregisterAll(new RandomItemsEvent());
            }

        } else if (event.getSlot() == 14) {
            if (event.getClick().isLeftClick()) {
                Bukkit.getServer().getPluginManager().registerEvents(new WaterEvent(), AssemblyForProject.getInstance());
            } else if (event.getClick().isRightClick()) {
                HandlerList.unregisterAll(new WaterEvent());
            }

        } else if (event.getSlot() == 15) {
            if (event.getClick().isLeftClick()) {
                Bukkit.getServer().getPluginManager().registerEvents(new BlockRandomEvent(), AssemblyForProject.getInstance());
            } else if (event.getClick().isRightClick()) {
                HandlerList.unregisterAll(new BlockRandomEvent());
            }
        }
    }
}
