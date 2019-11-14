package co_creation2.exercise06;

import co_creation2.exercise03.Tool;

import java.util.ArrayList;
import java.util.List;

public class Toolbox {
    private String color;
    private List<Tool> tools = new ArrayList<>();

    public Toolbox(String color) {
        this.color = color;
    }

    public void add(Tool tool) {
        tools.add(tool);
    }

    public List<Tool> getTools() {
        return tools;
    }
}
