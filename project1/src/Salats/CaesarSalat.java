package Salats;

import vegetables.*;

import java.util.ArrayList;
import java.util.List;

public class CaesarSalat extends Salat{
    String name = "Cалат Цезарь";

    public String getName() {
        return name;
    }

    public List<Vegetable> getIngridients() {
        List<Vegetable> ingridientes = new ArrayList<>();
        ingridientes.add(new Tomato(200));
        ingridientes.add(new Cucumber(100));
        ingridientes.add(new Onion(50));
        ingridientes.add(new Mushroom(50));
        ingridientes.add(new SweetPaper(500));
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

