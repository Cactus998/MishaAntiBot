package f3f5.govno.mishaantibot;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MishaAntiBot extends JavaPlugin implements Listener {
    public void onEnable() {
        getLogger().info("§eMishaAntiBot включен.");
        getLogger().info("§cСервер под защитой!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().kickPlayer("§7[§6MishaAntiBot§7]\n§f \n§fСервер находится под защитой MishaAntiBot!\n§cБоты не пройдут(говноеды тоже)!");
    }

    public void onDisable() {}
}
