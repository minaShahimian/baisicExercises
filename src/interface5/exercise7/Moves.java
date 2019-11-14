package interface5.exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Moves {
    private static List<Move> moves = Arrays.asList(
            new Rock(), new Paper(), new Scissors()
    );

    public static List<Move> asList() {
        return new ArrayList<>(moves);
    }

    public static String asString() {
        List<String> names = new ArrayList<>();
        for (Move move : moves) {
            names.add(move.getName());
        }
        return String.join(", ", names);
    }

    public static Optional<Move> get(String name) {
        for (Move move : moves) {
            if (move.getName().equalsIgnoreCase(name)) {
                return Optional.of(move);
            }
        }
        return Optional.empty();

    }

}
