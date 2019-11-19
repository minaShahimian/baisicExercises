package traits3.exercise01;


public class ScreenApplication {
        public static void main(String[] args) {
            Screen screen = new Screen();
            Customer Derek = new Customer("Derek", "Business",20);
            Customer Muller = new Customer("Muller", "Economic",25);

            screen.display(Derek);
            screen.display(Muller);
        }
    }

