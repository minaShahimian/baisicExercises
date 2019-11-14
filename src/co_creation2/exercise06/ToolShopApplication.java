package co_creation2.exercise06;

import co_creation2.exercise03.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolShopApplication {
    public static void main(String[] args) {
        List<String>toolsNames=new ArrayList<>();

        toolsNames.add("Hummer");
        toolsNames.add("screwdriver");
        toolsNames.add("drill");

        ShopAssistant shopAssistant = new ShopAssistant();
        Toolbox redToolbox = shopAssistant.findToolbox(toolsNames);
        List<Tool>tools=redToolbox.getTools();
        for (Tool tool : tools) {
            System.out.println(tool.getName());
            
        }
    }
}
