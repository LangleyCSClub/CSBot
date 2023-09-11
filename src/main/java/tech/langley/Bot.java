package tech.langley;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import tech.langley.events.EventHandler;

public class Bot {

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
