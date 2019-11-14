package interface5.exercise4;

import interface5.exercise5.Villain;

public class Superman implements Superhero {
    @Override
    public String getName(String name) {
        return "Superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName("Superman"));
    }
}
