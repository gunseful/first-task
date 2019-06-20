

import Salats.CaesarSalat;
import Salats.HuyalatSalat;
import Salats.SummerSalat;
import vegetables.Vegetable;

import java.io.IOException;

import static java.util.stream.Collectors.joining;

public class Chef {
    public void Greeting() {
        System.out.println("Здравствуйте! Держите меню, выберете один из наших салатов");
        System.out.println("Салат Летний");
        System.out.println("Цезарь");
        System.out.println("Салат Хуялат");
        System.out.println("\nО, все три? Хорошо:)");


    }

    public void makingSummerSalat(SummerSalat salat) throws IOException, InterruptedException {
        salat.getName();
        System.out.println("\nНачинаем готовить " + salat.getName());
        System.out.print("Кладем в чашку - ");
        String vegetableList = salat.getIngridients().stream().map(Vegetable::getName).collect(joining(", "));
        System.out.println(vegetableList + ".");
        System.out.println("Перемешиваем");
        System.out.println("Готово!\n");
        double TotalCallories = 0;
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            System.out.println(" Количество каллорий в 100гр салата " + salat.getIngridients().get(i).getName() + " - " + salat.getIngridients().get(i).getCalorie());
        }
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            TotalCallories = salat.getIngridients().get(i).getCalorie() + TotalCallories;
        }
        System.out.println("\n Общее количество каллорий в 100гр салата " + TotalCallories);
    }

    public void makingCaesarSalat(CaesarSalat salat) throws IOException, InterruptedException {
        salat.getName();
        System.out.println("\nНачинаем готовить " + salat.getName());
        System.out.print("Кладем в чашку - ");
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            if (i == salat.getIngridients().size() - 1) {
                System.out.print(salat.getIngridients().get(i).getName() + ". ");
            } else {
                System.out.print(salat.getIngridients().get(i).getName() + ", ");
            }
        }
        System.out.println("Перемешиваем");
        System.out.println("Готово!\n");
        double TotalCallories = 0;
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            System.out.println(" Количество каллорий в 100гр салата " + salat.getIngridients().get(i).getName() + " - " + salat.getIngridients().get(i).getCalorie());
        }
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            TotalCallories = salat.getIngridients().get(i).getCalorie() + TotalCallories;
        }
        System.out.println("\n Общее количество каллорий в 100гр салата " + TotalCallories);
    }

    public void makingHuyalatSalat(HuyalatSalat salat) throws IOException, InterruptedException {
        salat.getName();
        System.out.println("\nНачинаем готовить " + salat.getName());
        System.out.print("Кладем в чашку - ");
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            if (i == salat.getIngridients().size() - 1) {
                System.out.print(salat.getIngridients().get(i).getName() + ". ");
            } else {
                System.out.print(salat.getIngridients().get(i).getName() + ", ");
            }
        }
        System.out.println("Перемешиваем");
        System.out.println("Готово!\n");
        double TotalCallories = 0;
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            System.out.println(" Количество каллорий в 100гр салата " + salat.getIngridients().get(i).getName() + " - " + salat.getIngridients().get(i).getCalorie());
        }
        for (int i = 0; i < salat.getIngridients().size(); i++) {
            TotalCallories = salat.getIngridients().get(i).getCalorie() + TotalCallories;
        }
        System.out.println("\n Общее количество каллорий в 100гр салата " + TotalCallories);
    }
}
