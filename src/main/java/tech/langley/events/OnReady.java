package tech.langley.events;

import net.dv8tion.jda.api.events.session.ReadyEvent;

public class OnReady extends BotEvent {

    public OnReady() {
        super();
    }
    
    @Override
    public void onReady(ReadyEvent event) {
        System.out.println("Bot is ready!");
    }
}
