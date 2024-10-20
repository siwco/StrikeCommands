package club.siwoo.strikecommands;

import org.bukkit.plugin.java.JavaPlugin;

public final class StrikeCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[StrikeCommands] Hello!");
    }

    @Override
    public void onDisable() {
        getLogger().info("[StrikeCommands] Goodbye!");
    }
}
