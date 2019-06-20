package salats;


import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;

public abstract class Salat {
    private String name;
    public List<Vegetable> vegetables = new ArrayList<Vegetable>();

    public abstract String getName();

    public abstract List<Vegetable> getIngridients();
}
