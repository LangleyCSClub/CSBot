package tech.langley.bot.events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class OnMessage extends BotEvent {

    public OnMessage() {
        super();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        if (event.getMessage().getContentRaw().equalsIgnoreCase("ping")) {
            event.getMessage().reply("Pong!").queue();
        }
    }
}
