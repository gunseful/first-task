package people;

import salats.Salat;
import vegetables.Vegetable;

import java.io.IOException;

import static java.util.stream.Collectors.joining;

public class Chef {
    private Salat salat;

    public void takeTaskFromWaiter(Salat salat){
        this.salat = salat;
    }


    public Salat makingSalat() throws IOException, InterruptedException {
        System.out.println("\nНачинаем готовить " + salat.getName());
        System.out.print("Кладем в чашку - ");
        String vegetableList = salat.getIngridients().stream().map(Vegetable::getName).collect(joining(", "));
        System.out.println(vegetableList + ".");
        System.out.println("Перемешиваем");
        System.out.println("Готово!\n");
        return salat;
    }
}
