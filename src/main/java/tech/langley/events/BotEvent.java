package tech.langley.events;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import tech.langley.Bot;

public class BotEvent extends ListenerAdapter {

    protected JDA jda;

    public BotEvent() {
        this.jda = Bot.getBot();
        this.jda.addEventListener(this);
    }

}
