package tech.langley.bot.commands.core;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import tech.langley.bot.CSBot;
import tech.langley.bot.commands.SlashCommand;

public class HelpCmd extends SlashCommand {

    public HelpCmd() {
        super("help", "The Help Command", "`/help`");
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {

        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Help");
        embed.setDescription("This is the help command");
        embed.setColor(0x00ff00);

        CSBot.getCmdHandler().getCmds().forEach((command) -> {
            embed.addField(command.getName(), command.getUsage(), false);
        });

        event.replyEmbeds(embed.build()).queue();
    }
    
}
