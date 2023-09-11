package tech.langley.bot.commands;

import java.util.ArrayList;
import java.util.List;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.interactions.commands.build.SubcommandData;
import tech.langley.bot.CSBot;

// Slash command class template PLEASE USE THIS
public abstract class SlashCommand {

    protected JDA jda = CSBot.getBot();

    private String name; 

    private String description;

    private List<OptionData> oData = new ArrayList<>();

    private List<SubcommandData> sData = new ArrayList<>();

    public SlashCommand(String name, String description) {
        this.name = name.toLowerCase();
        this.description = description;
        CSBot.getCmdHandler().addCommand(this);
    }

    public void addOption(OptionData oData) {
        this.oData.add(oData);
    }

    public void addSubcommandData(SubcommandData sData) {
        this.sData.add(sData);
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public List<OptionData> getOptionData() {
        return this.oData;
    }

    public List<SubcommandData> getSubcommandData() {
        return this.sData;
    }

    public abstract void execute(SlashCommandInteractionEvent event);
}

