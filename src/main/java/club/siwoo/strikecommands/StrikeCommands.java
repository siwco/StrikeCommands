package club.siwoo.strikecommands;

import club.siwoo.strikecommands.admin.ForceWin;
import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class StrikeCommands extends JavaPlugin implements Listener {

    private StrikePracticeAPI api;
    File newConfig;
    FileConfiguration newConfigz;

    @Override
    public void onEnable() {
        this.api = StrikePractice.getAPI();
        registerCommands();
    }

    public void registerCommands() {
        getCommand("forcewin").setExecutor(new ForceWin());
    }

    public void checkConfig() {
        newConfig = new File(getDataFolder(), "config.yml");
        newConfigz = YamlConfiguration.loadConfiguration(newConfig);
        saveNewConfig();
    }

    public void saveNewConfig() {
        try {
            newConfigz.save(newConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye!");
    }
}
