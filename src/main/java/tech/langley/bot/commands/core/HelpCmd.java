package tech.langley.bot.commands.core;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import tech.langley.bot.commands.SlashCmd;

public class HelpCmd extends SlashCmd {

    public HelpCmd() {
        super("help", "The Help Command");
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {

        

    }
    
}
