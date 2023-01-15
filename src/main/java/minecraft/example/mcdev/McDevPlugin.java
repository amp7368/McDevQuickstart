package minecraft.example.mcdev;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.PaperCommandManager;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class McDevPlugin extends JavaPlugin {


    public PaperCommandManager acf;
    private static McDevPlugin plugin;

    public static McDevPlugin get() {
        return plugin;
    }

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        acf = new PaperCommandManager(this);
        new CommandPing();
        getLogger().info("McDev plugin loaded");
    }

    public void registerCommand(BaseCommand commandPing) {
        acf.registerCommand(commandPing);
    }

    public void registerEvents(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, this);
    }
}
