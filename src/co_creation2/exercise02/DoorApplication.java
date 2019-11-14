package co_creation2.exercise02;

public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(22);
        Key key = new Key();
        key.open(door);

    }
}


