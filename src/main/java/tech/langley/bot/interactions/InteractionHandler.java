package tech.langley.bot.interactions;

import java.util.ArrayList;
import java.util.List;

public class InteractionHandler {

    private List<BotInteraction> interactions = new ArrayList<>();

    // Register interactions
    public void registerInteractions() {
        
    }

    // Add interactions to list
    public void addInteraction(BotInteraction bInteraction) {
        this.interactions.add(bInteraction);
    }

    // Get list of interactions
    public List<BotInteraction> getInteractions() {
        return this.interactions;
    }
    
}
