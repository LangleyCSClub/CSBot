package tech.langley.bot.events;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import tech.langley.bot.CSBot;
import tech.langley.bot.interactions.InteractionType;

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


    @Override
    public void onButtonInteraction(ButtonInteractionEvent event) {
        CSBot.gInteractionHandler().getInteractions().forEach((btnInteraction) -> {
            if(btnInteraction.getType() == InteractionType.BUTTON && btnInteraction.getId().equalsIgnoreCase(event.getId())) {
                btnInteraction.execute(event);
                return;
            }
        });
    }

    @Override
    public void onStringSelectInteraction(StringSelectInteractionEvent event) {
        CSBot.gInteractionHandler().getInteractions().forEach((selectInteraction) -> {
            if(selectInteraction.getType() == InteractionType.SELECT && selectInteraction.getId().equalsIgnoreCase(event.getId())) {
                selectInteraction.execute(event);
                return;
            }
        });
    }

    @Override
    public void onModalInteraction(ModalInteractionEvent event) {
        CSBot.gInteractionHandler().getInteractions().forEach((modelInteraction) -> {
            if(modelInteraction.getType() == InteractionType.MODEL && modelInteraction.getId().equalsIgnoreCase(event.getId())) {
                modelInteraction.execute(event);
                return;
            }
        });
    }

}
