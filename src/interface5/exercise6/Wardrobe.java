package interface5.exercise6;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture {

    private List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    public List<String> getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "Wardrobe{parts=" + parts + " }";
    }
}
