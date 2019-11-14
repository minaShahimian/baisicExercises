package interface5.exercise6;

import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {

    private List<Step> steps = getSteps();

    private List<Step> getSteps() {
        AddBack back = new AddBack();
        AddBottom bottom = new AddBottom();
        AddDoor door = new AddDoor();
        AddShelf shelf = new AddShelf();
        AddSide side = new AddSide();
        AddTop top = new AddTop();
        return Arrays.asList(
                back, bottom, door, shelf, side, top);
    }

    public Wardrobe build() {
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }
}
