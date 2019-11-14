package traits3.exercise01;

public class Screen {


        public void display(Customer customer) {
            System.out.println(formatName(customer));
        }

        public String formatName(Customer customer) {
            String category = customer.getCategory();
            if (category.equalsIgnoreCase("business")) {
                return customer.getName().toUpperCase();
            }
            return customer.getName().toLowerCase();
        }

    }


