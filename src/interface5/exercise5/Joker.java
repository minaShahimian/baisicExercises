package interface5.exercise5;

public class Joker implements Villain {

    private Integer lives = 10;

    @Override
    public void weaken(String name) {

        System.out.println("Damn you "+name+" ! You managed to weaken me!");
        lives--;
        if (lives.equals(0)){
            System.out.println("You all defeated me! But I will be back! ");
        }




    }
}
