package salats;

import vegetables.Cucumber;
import vegetables.Onion;
import vegetables.Tomato;
import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class SummerSalat extends Salat {
    String name = "Летний салат";

    public String getName() {
        return name;
    }

    public List<Vegetable> getIngridients() {
        List<Vegetable> ingridientes = new ArrayList<>();
        ingridientes.add(new Tomato(200));
        ingridientes.add(new Cucumber(100));
        ingridientes.add(new Onion(50));

        return ingridientes;
    }
}

