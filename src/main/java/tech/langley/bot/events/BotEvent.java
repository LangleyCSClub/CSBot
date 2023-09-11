package tech.langley.bot.events;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tech.langley.bot.CSBot;

// Event class template PLEASE USE THIS
public abstract class BotEvent extends ListenerAdapter {

    protected JDA jda;

    public BotEvent() {
        this.jda = CSBot.getBot();
        this.jda.addEventListener(this);
    }

}
