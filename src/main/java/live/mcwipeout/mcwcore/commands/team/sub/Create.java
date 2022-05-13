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
        new Team(args[0], getChatColorByCode(args[2]));
    }

    private ChatColor getChatColorByCode(String colorCode){
        switch (colorCode){
            case "b" : return ChatColor.AQUA;
            case "0" : return ChatColor.BLACK;
            case "9" : return ChatColor.BLUE;
            case "l" : return ChatColor.BOLD;
            case "3" : return ChatColor.DARK_AQUA;
            case "1" : return ChatColor.DARK_BLUE;
            case "8" : return ChatColor.DARK_GRAY;
            case "2" : return ChatColor.DARK_GREEN;
            case "5" : return ChatColor.DARK_PURPLE;
            case "4" : return ChatColor.DARK_RED;
            case "6" : return ChatColor.GOLD;
            case "7" : return ChatColor.GRAY;
            case "a" : return ChatColor.GREEN;
            case "o" : return ChatColor.ITALIC;
            case "d" : return ChatColor.LIGHT_PURPLE;
            case "k" : return ChatColor.MAGIC;
            case "c" : return ChatColor.RED;
            case "r" : return ChatColor.RESET;
            case "m" : return ChatColor.STRIKETHROUGH;
            case "n" : return ChatColor.UNDERLINE;
            case "f" : return ChatColor.WHITE;
            case "e" : return ChatColor.YELLOW;
            default: return ChatColor.WHITE;
        }
    }
}
