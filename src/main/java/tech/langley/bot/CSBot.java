package tech.langley.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import tech.langley.bot.events.EventHandler;

public class CSBot {
    
    private static JDA jda;

    public static void main(String[] args) {

        jda = JDABuilder.createDefault(args[0])
        .enableIntents(GatewayIntent.MESSAGE_CONTENT)
        .build();

        EventHandler eventHandler = new EventHandler();
        eventHandler.registerEvents();

    }

    public static JDA getBot() {
        return jda;
    }
}
