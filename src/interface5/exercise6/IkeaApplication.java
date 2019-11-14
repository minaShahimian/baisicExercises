package interface5.exercise6;

public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe build = wardrobeBuilder.build();
        System.out.println(build);
    }
}
