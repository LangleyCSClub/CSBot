package tech.langley.bot.commands;

import java.util.ArrayList;
import java.util.List;

import tech.langley.bot.commands.core.HelpCmd;

public class CommandHandler {
    
    private List<SlashCmd> commands = new ArrayList<>();

    public void registerCommands() {
        new HelpCmd();
    }

    public void addCommand(SlashCmd sCmd) {
        this.commands.add(sCmd);
    }

    public List<SlashCmd> getCmds() {
        return this.commands;
    }

}
