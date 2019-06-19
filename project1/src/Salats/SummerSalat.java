package Salats;

import vegetables.Cucumber;
import vegetables.Onion;
import vegetables.Tomato;
import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class SummerSalat extends Salat{
    String name = "Летний салат";

    public String getName() {
        return name;
    }

    public List<Vegetable> getIngridients() {
        List<Vegetable> ingridientes = new ArrayList<>();
        ingridientes.add(new Tomato(200));
        ingridientes.add(new Cucumber(100));
        ingridientes.add(new Onion(50));
        for (int i = 0; i < ingridientes.size(); i++) {
            for (int n = 1; n < ingridientes.size(); n++) {
                if (ingridientes.get(n).getCalorie() > ingridientes.get(n - 1).getCalorie()) {
                    Vegetable less = ingridientes.get(n - 1);
                    Vegetable more = ingridientes.get(n);
                    ingridientes.remove(n - 1);
                    ingridientes.add(n - 1, more);
                    ingridientes.remove(n);
                    ingridientes.add(n, less);
                }
            }
        }
        return ingridientes;
    }

    }

