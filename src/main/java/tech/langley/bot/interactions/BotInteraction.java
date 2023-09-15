package tech.langley.bot.interactions;

import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.StringSelectInteractionEvent;
import tech.langley.bot.CSBot;

public abstract class BotInteraction {
    
    private String Id;

    private InteractionType type = InteractionType.NONE;

    public BotInteraction(String Id, InteractionType type) {
        this.Id = Id;
        this.type = type;
        CSBot.gInteractionHandler().addInteraction(this);
    }

    public String getId() {
        return this.Id;
    }

    public InteractionType getType() {
        return this.type;
    }

    public abstract void execute(ButtonInteractionEvent event);

    public abstract void execute(StringSelectInteractionEvent event);

    public abstract void execute(ModalInteractionEvent event);

}
