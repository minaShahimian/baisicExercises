package co_creation2.exercise06;

import co_creation2.exercise03.Tool;

import java.util.List;

public class ShopAssistant {
    public Toolbox findToolbox(List<String> toolNames) {
        Toolbox redToolbox = new Toolbox("red");

        for (String toolName : toolNames) {
            Tool tool = new Tool(toolName);
            redToolbox.add(tool);
        }
        return redToolbox;
    }
}
