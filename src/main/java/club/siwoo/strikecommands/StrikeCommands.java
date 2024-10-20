package club.siwoo.strikecommands;

import club.siwoo.strikecommands.admin.ForceWin;
import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class StrikeCommands extends JavaPlugin implements Listener {

    private StrikePracticeAPI api;

    @Override
    public void onEnable() {
        this.api = StrikePractice.getAPI();
        registerCommands();
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye!");
    }

    public void registerCommands() {
        getCommand("forcewin").setExecutor(new ForceWin());
    }
}
