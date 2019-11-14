package interface5.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {

    private List<Superhero> superheroes = Arrays.asList(
            new Batman(), new Superman(), new Spiderman());


    private Random random = new Random();

    public Superhero call() {
        int position = random.nextInt(superheroes.size());
        return superheroes.get(position);
    }

}
