package minecraft.example.mcdev;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import org.bukkit.entity.Player;

@CommandAlias("ping")
public class CommandPing extends BaseCommand {

    public CommandPing() {
        McDevPlugin.get().registerCommand(this);
    }

    @Default
    public void ping(Player player) {
        player.sendMessage("Pong!");
    }
}
