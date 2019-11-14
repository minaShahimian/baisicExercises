package interface5.exercise7;

public class Scissors implements Move {
    @Override
    public String getName() {
        return "Scissors";
    }

    @Override
    public boolean defeats(Move move) {
        return move.getName().equalsIgnoreCase("paper");
    }

}
