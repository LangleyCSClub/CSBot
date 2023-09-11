package tech.langley.bot.events;

public class EventHandler {

    // Register events
    public void registerEvents() {
        new OnReady();
        new OnMessage();
        new OnInteraction();
    }

}
