package interface5.reflection;

import interface5.exercise6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {

    private List<String > parts=new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }
}
