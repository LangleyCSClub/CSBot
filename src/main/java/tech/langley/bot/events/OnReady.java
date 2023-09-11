package tech.langley.bot.events;

import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Activity.ActivityType;


public class OnReady extends BotEvent {

    public OnReady() {
        super();
    }

    private void post() {
        
    }
    
    @Override
    public void onReady(ReadyEvent event) {
        System.out.println("Bot is ready!");
        event.getJDA().setPresence(OnlineStatus.ONLINE, Activity.of(ActivityType.PLAYING, "with your mom"));

        // Guild[] guild = event.getJDA().getGuilds();

        // System.out.println(event.getJDA().getGuilds());

    }
}
