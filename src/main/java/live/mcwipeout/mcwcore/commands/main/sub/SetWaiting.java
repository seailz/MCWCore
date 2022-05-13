package live.mcwipeout.mcwcore.commands.main.sub;

import games.negative.framework.command.SubCommand;
import games.negative.framework.command.annotation.CommandInfo;
import games.negative.framework.message.Message;
import live.mcwipeout.mcwcore.MCWCore;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;

@CommandInfo(
        name = "setwaiting",
        permission = "mcw.admin",
        playerOnly = true,
        args = {"team"}
)
public class SetWaiting extends SubCommand {
    @Override
    public void onCommand(CommandSender sender, String[] args) {
        if (MCWCore.getInst().getConfig().getLocation("spawn") == null) {
            new Message(
                    "&cNo spawn location is set!"
            ).send(sender);
            return;
        }

        Location spawn = MCWCore.getInst().getConfig().getLocation("spawn");

    }
}
