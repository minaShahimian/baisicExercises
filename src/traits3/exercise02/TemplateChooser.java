package traits3.exercise02;

import traits3.exercise01.Customer;

public class TemplateChooser {
    public String chooseTemplate(Customer customer) {

        if (isPrivilegedTemplate(customer)) {
            return "privileged";
        }
        if (isManTemplate(customer)) {
            return "Man";
        }
        if (isWomanTemplate(customer)) {
            return "Woman";
        }
        return "default";
    }

    public Boolean isPrivilegedTemplate(Customer customer) {
        return customer.getName().contains("Hokopoko");
    }

    public Boolean isManTemplate(Customer customer) {
        return customer.getName().trim().startsWith("Mr");
    }

    public Boolean isWomanTemplate(Customer customer) {
        return customer.getName().trim().startsWith("Ms") || customer.getName().trim().startsWith("Mrs");
    }
}




