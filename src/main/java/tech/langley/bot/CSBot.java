package tech.langley.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Activity.ActivityType;
import net.dv8tion.jda.api.requests.GatewayIntent;
import tech.langley.bot.commands.CommandHandler;
import tech.langley.bot.events.EventHandler;

public class CSBot {
    
    private static JDA jda;

    private static EventHandler eventHandler;

    private static CommandHandler commandHandler;

    public static void main(String[] args) {

        // Initialize bot
        jda = JDABuilder.createDefault(args[0])
        .enableIntents(GatewayIntent.MESSAGE_CONTENT)
        .setActivity(Activity.of(ActivityType.PLAYING, "I AM CSBOT"))
        .build();

        try {

            // Initialize handlers
            commandHandler = new CommandHandler();
            eventHandler = new EventHandler();

        } catch (Exception e) {

            System.out.println(e);

        } finally {

            // Register handlers
            commandHandler.registerCommands();
            eventHandler.registerEvents();  

        }

    }

    public static CommandHandler getCmdHandler() {
        return commandHandler;
    }

    public static JDA getBot() {
        return jda;
    }
}
