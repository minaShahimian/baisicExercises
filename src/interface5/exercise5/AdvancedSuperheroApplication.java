package interface5.exercise5;

import interface5.exercise4.Superhero;
import interface5.exercise4.SuperheroCaller;

public class AdvancedSuperheroApplication {
    public static void main(String[] args) {
        Joker joker = new Joker();
        SuperheroCaller caller = new SuperheroCaller();

        for (int time = 0; time < 10; time++) {
            Superhero superhero = caller.call();
            superhero.fight(joker);
        }
    }
}
