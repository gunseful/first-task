package salats;

import vegetables.*;

import java.util.ArrayList;
import java.util.List;

public class CaesarSalat extends Salat{
    private String name = "Cалат Цезарь";

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

        return ingridientes;
    }

}

