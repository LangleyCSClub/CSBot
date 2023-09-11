package tech.langley.bot.commands;

import java.util.ArrayList;
import java.util.List;

import tech.langley.bot.commands.core.HelpCmd;

public class CommandHandler {
    
    private List<SlashCommand> commands = new ArrayList<>();

    // Register commands
    public void registerCommands() {
        new HelpCmd();
    }

    // Add command to list
    public void addCommand(SlashCommand sCmd) {
        this.commands.add(sCmd);
    }

    // Get list of commands
    public List<SlashCommand> getCmds() {
        return this.commands;
    }

}
