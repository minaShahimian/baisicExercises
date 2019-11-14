package interface5.reflection;

import interface5.exercise6.Furniture;
import interface5.exercise6.Step;

public class legs implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("legs");
    }
}
