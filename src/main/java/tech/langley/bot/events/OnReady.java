package tech.langley.bot.events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;
import tech.langley.bot.CSBot;

import java.util.ArrayList;
import java.util.List;

public class OnReady extends BotEvent {

    public OnReady() {
        super();
    }

    private void post(List<Guild> guilds) {
        List<SlashCommandData> guildCommands = new ArrayList<>();

        CSBot.getCmdHandler().getCmds().forEach((command) -> {
            SlashCommandData guildCommand = Commands.slash(command.getName(), command.getDescription());
            if(command.getOptionData().size() > 0) guildCommand.addOptions(command.getOptionData());
            if(command.getSubcommandData().size() > 0) guildCommand.addSubcommands(command.getSubcommandData());
            guildCommands.add(guildCommand);
        });

        guilds.forEach((guild) -> {
            guild.updateCommands().addCommands(guildCommands);
        });
    }
    
    @Override
    public void onReady(ReadyEvent event) {

        System.out.println("Bot is ready!");

        this.post(event.getJDA().getGuilds());
    }
}
