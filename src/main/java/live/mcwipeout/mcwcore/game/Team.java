package live.mcwipeout.mcwcore.game;

import live.mcwipeout.mcwcore.MCWCore;
import lombok.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
public class Team {

    private ChatColor color;
    private String name;
    private ArrayList<UUID> players = new ArrayList<>();

    public Team(String name, ChatColor color) {
        setName(name);
        setColor(color);
    }

    public static void getTeamFromConfig(String path) {

    }

    public void save(String path) {
        MCWCore.getInst().getConfig().set(path + ".name", name);
        MCWCore.getInst().getConfig().set(path + ".color", "&" + color.getChar());
        MCWCore.getInst().getConfig().set(path + ".players", players);
        MCWCore.getInst().saveConfig();
    }

    public enum CommandColors {

        BLACK("Black", ChatColor.BLACK),
        DARK_BLUE("DarkBlue", ChatColor.DARK_BLUE),
        DARK_GREEN("DarkGreen", ChatColor.DARK_GREEN),
        DARK_AQUA("DarkAqua", ChatColor.DARK_AQUA),
        DARK_RED("DarkRed", ChatColor.DARK_RED),
        DARK_PURPLE("DarkPurple", ChatColor.DARK_PURPLE),
        GOLD("Gold", ChatColor.GOLD),
        GRAY("Gray", ChatColor.GRAY),
        GREY("Grey", ChatColor.GRAY),
        DARK_GRAY("DarkGray", ChatColor.DARK_GRAY),
        DARK_GREY("DarkGrey", ChatColor.DARK_GRAY),
        BLUE("Blue", ChatColor.BLUE),
        GREEN("Green", ChatColor.GREEN),
        AQUA("Aqua", ChatColor.AQUA),
        RED("Red", ChatColor.RED),
        LIGHT_PURPLE("LightPurple", ChatColor.LIGHT_PURPLE),
        YELLOW("Yellow", ChatColor.YELLOW),
        WHITE("White", ChatColor.WHITE);

        final String colorName;
        final ChatColor color;

        CommandColors(String colorName, ChatColor color) {
            this.colorName = colorName;
            this.color = color;
        }

        public static ChatColor getByName(String name) {
            for (CommandColors value : values()) {
                if (value.colorName.equalsIgnoreCase(name)) {
                    return value.color;
                }
            }

            return BLACK.color;
        }
    }

}
