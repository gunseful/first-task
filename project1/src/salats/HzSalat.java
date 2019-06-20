package salats;

import vegetables.Garlic;
import vegetables.Onion;
import vegetables.Tomato;
import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class HzSalat extends Salat {
    private String name = "ХЗ салат";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Vegetable> getIngridients() {
        List<Vegetable> vegetables = new ArrayList<>();
        vegetables.add(new Tomato(89));
        vegetables.add(new Garlic(78));
        vegetables.add(new Onion(78));
        return vegetables;
    }
}
