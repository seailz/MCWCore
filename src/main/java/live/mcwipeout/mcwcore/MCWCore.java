package live.mcwipeout.mcwcore;

import games.negative.framework.BasePlugin;
import live.mcwipeout.mcwcore.core.Locale;

public final class MCWCore extends BasePlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        Locale.init(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
