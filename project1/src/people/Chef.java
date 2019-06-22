package people;

import menu.Kitchen;
import salats.Salat;
import vegetables.Vegetable;

import static java.util.stream.Collectors.joining;

public class Chef {
    private String task;
    private Salat salat;

    public void takeTaskFromWaiter(String task) {
        this.task = task.toLowerCase();
    }


    public Salat makingSalat() {
        try {
            for (Kitchen o : Kitchen.values()) {
                String salatName = o.getName();
                if (salatName.equals(task)) {
                    salat = o.getSalat();
                }
            }
        } catch (Exception e) {

        }
        try {
            System.out.println("\nНачинаем готовить " + salat.getName());
            System.out.print("Кладем в чашку - ");
            String vegetableList = salat.getIngridients().stream().map(Vegetable::getName).collect(joining(", "));
            System.out.println(vegetableList + ".");
            System.out.println("Перемешиваем");
            System.out.println("Готово!\n");
        } catch (Exception e) {
            System.out.println("Извините, такого салата в меню нет");
        }

        return salat;
    }

    public Salat getSalat() {
        return salat;
    }
}
