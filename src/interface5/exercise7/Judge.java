package interface5.exercise7;

public class Judge {
    public String judge(Move move1, Move move2) {
        displaye(move1, move2);
        return findWinner(move1, move2);
    }

    private String findWinner(Move move1, Move move2) {
        if (move1.defeats(move2)) {
            return "you win.";
        }
        if (move2.defeats(move1)) {
            return "The camputer wins.";
        }
        return "Nobady wins.";
    }

    private void displaye(Move move1, Move move2) {
        System.out.println("Player 1 choose: " + move1.getName());
        System.out.println("Player 2 choose: " + move2.getName());
    }
}
