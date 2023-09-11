package tech.langley.bot.events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import tech.langley.bot.CSBot;

public class OnInteraction extends BotEvent {
    
    public OnInteraction() {
        super();
    }

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        // Check if command exists and executes it
        CSBot.getCmdHandler().getCmds().forEach((command) -> {
            if(command.getName().equalsIgnoreCase(event.getName())) {
                command.execute(event);
                return;
            }
        });
    }
}
