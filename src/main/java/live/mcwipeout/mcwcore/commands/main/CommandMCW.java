package live.mcwipeout.mcwcore.commands.main;

import games.negative.framework.command.Command;
import games.negative.framework.command.annotation.CommandInfo;
import org.bukkit.command.CommandSender;

@CommandInfo(
        name = "mcw",
        permission = "mcw.admin"
)
public class CommandMCW extends Command {

    public CommandMCW() {
        this.addSubCommands(

        );
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {

    }
}
