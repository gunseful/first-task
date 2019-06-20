package salats;

import vegetables.*;

import java.util.ArrayList;
import java.util.List;

public class HuyalatSalat extends Salat {
    String name = "Cалат Хуялат";

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
        ingridientes.add(new Garlic(700));
        ingridientes.add(new Radish(800));

        return ingridientes;
    }
}
