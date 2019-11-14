package interface5.exercise4;

import java.util.ArrayList;

public class SuperheroApplication {
    public static void main(String[] args) {
        SuperheroCaller caller = new SuperheroCaller();
        Superhero call = caller.call();
        System.out.println("Superhero: " + call.getName("Batman"));

        ArrayList<Superhero> superheroes = new ArrayList<>();
        for (int times = 1; times < 7; times++) {

            Superhero hero = caller.call();
            superheroes.add(hero);
            System.out.println("Superhero "+times+": "+hero.getName(""));
        }
        int size = superheroes.size();
        System.out.println("Number of superheroes: "+size);
    }
}
