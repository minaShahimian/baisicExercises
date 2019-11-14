package co_creation2.exercise03;

public class paintingApplication {
    public static void main(String[] args) {
        Tool hummer = new Tool("hummer");
        Derek derek = new Derek();
        derek.setTool(hummer);
        derek.hangPainting();

    }
}
