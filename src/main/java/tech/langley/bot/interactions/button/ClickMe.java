package tech.langley.bot.interactions.button;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import tech.langley.bot.interactions.BotInteraction;
import tech.langley.bot.interactions.InteractionType;

public class ClickMe extends BotInteraction {

    public ClickMe() {
        super("btn-click-me", InteractionType.BUTTON);
    }

    @Override
    public void execute(ButtonInteractionEvent event) {
        event.reply("You Clicked ME!").setEphemeral(true).queue();
        return;
    }

    @Override
    public void execute(StringSelectInteractionEvent event) {
        return;
    }

    @Override
    public void execute(ModalInteractionEvent event) {
        return;
    }
}
