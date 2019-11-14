package interface5.exercise7;

public class Game {
    private Player player1 = new Human();
    private Player player2 = new Computer();
    private Judge judge = new Judge();

    public void Play() {
        displayWelcomeToPlay();
        boolean playersWantToPlay = true;
        while (playersWantToPlay) {
            playOneRound();
            playersWantToPlay = askToPlayer();
        }
        displayGoodbyeMessage();
    }

    private void displayGoodbyeMessage() {
        System.out.println("See you next time!");
    }

    private boolean askToPlayer() {
        return player1.wantsToPlayAgain() && player2.wantsToPlayAgain();
    }

    private void playOneRound() {
        Move move1 = player1.choose();
        Move move2 = player2.choose();
        String result = judge.judge(move1, move2);
        System.out.println(result);
    }

    private void displayWelcomeToPlay() {
        String moves = Moves.asString();
        System.out.println("Lets play: " + moves + " !");

    }
}
