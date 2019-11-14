package listSetsMapsOptionals4.exercise05;

import java.util.Objects;

public class Grocery {
    private String name;

    public Grocery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name= "+name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grocery)) return false;
        Grocery grocery = (Grocery) o;
        return name.equals(grocery.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


