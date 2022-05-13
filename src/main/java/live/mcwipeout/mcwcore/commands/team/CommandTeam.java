package live.mcwipeout.mcwcore.commands.team;

import games.negative.framework.command.Command;
import games.negative.framework.command.annotation.CommandInfo;
import org.bukkit.command.CommandSender;

@CommandInfo(
        name = "team",
        permission = "mcw.admin"
)
public class CommandTeam extends Command {

    public CommandTeam() {
        this.addSubCommands(

        );
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {

    }
}
