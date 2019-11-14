package co_creation2.exercise03;

public class Derek {

    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public boolean canHangPainting() {

        return tool.getName().equals("Hummer") ||tool.getName().equals("hummer");

    }

    public void hangPainting() {
        if (canHangPainting()) {
            System.out.println("He can hang the painting.");
        } else {
            System.out.println("Derek missing the Hummer.");
        }
    }
}