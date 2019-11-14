package traits3.exercise01;


public class ScreenApplication {
        public static void main(String[] args) {
            Screen screen = new Screen();
            Customer Dreck = new Customer("Dreck", "Business");
            Customer Müller = new Customer("Müller", "Economic");

            screen.display(Dreck);
            screen.display(Müller);
        }
    }

