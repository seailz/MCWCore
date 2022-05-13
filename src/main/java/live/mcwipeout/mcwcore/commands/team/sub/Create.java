package live.mcwipeout.mcwcore.commands.team.sub;

import games.negative.framework.command.SubCommand;
import games.negative.framework.command.annotation.CommandInfo;
import live.mcwipeout.mcwcore.game.Team;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

@CommandInfo(
        name = "create",
        permission = "mcw.admin",
        args = {"name", "color"}
)
public class Create extends SubCommand {
    @Override
    public void onCommand(CommandSender sender, String[] args) {
        new Team(args[0], ChatColor.RED);
    }
}
