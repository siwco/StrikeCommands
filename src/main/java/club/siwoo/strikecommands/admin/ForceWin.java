package club.siwoo.strikecommands.admin;

import com.sun.istack.internal.NotNull;
import ga.strikepractice.api.StrikePracticeAPI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ForceWin implements CommandExecutor {

    private StrikePracticeAPI api;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(sender.hasPermission("strikecommands.admin")) {
            return true;
        } else {
            return true;
        }
    }

    public void forceWinFight(Player p) {
        // Method
    }

    public void forceWinRound(Player p) {
        // Method
    }
}
