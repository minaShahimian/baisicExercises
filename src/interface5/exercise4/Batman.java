package interface5.exercise4;

import interface5.exercise5.Villain;

public class Batman implements Superhero {
    @Override
    public String getName(String name) {
        return "Batman";
    }

    @Override
    public void fight(Villain villain) {
         villain.weaken(getName("Batman"));
    }
}
