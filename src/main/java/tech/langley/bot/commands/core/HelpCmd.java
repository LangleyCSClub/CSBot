package tech.langley.bot.commands.core;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import tech.langley.bot.commands.SlashCommand;

public class HelpCmd extends SlashCommand {

    public HelpCmd() {
        super("help", "The Help Command");
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {

        event.reply("No Help For you ;)").setEphemeral(true).queue();

    }
    
}
