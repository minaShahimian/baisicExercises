package traits3.exercise02;

import traits3.exercise01.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        Customer mina = new Customer("Ms.Mina", "business");
        Customer amin = new Customer("Mr.Amin", "Business");
        Customer hokopoko = new Customer("Hokopoko", "Business");
        TemplateChooser templateChooser = new TemplateChooser();
        System.out.println(templateChooser.chooseTemplate(mina));
        System.out.println(templateChooser.chooseTemplate(amin));
        System.out.println(templateChooser.chooseTemplate(hokopoko));
    }
}
