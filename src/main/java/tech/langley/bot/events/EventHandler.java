package tech.langley.bot.events;

public class EventHandler {

    public void registerEvents() {
        new OnReady();
        new OnMessage();
    }

}
