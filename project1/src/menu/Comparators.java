package menu;

import vegetables.Vegetable;

import java.util.Comparator;

public class Comparators {
    public static Comparator<Vegetable> CALORIE = new Comparator<Vegetable>() {
        @Override
        public int compare(Vegetable o1, Vegetable o2) {
            return (int) (o1.getCalorie() - o2.getCalorie());
        }
    };
}

