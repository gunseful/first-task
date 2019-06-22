package people;

import menu.Comparators;
import menu.Menu;
import salats.Salat;
import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Waiter {
    private String dishName;
    String word = null;
    private Salat salat = null;
    ArrayList<String> menu;

    public String firstUpperCase(String word) {
        if (word == null || word.isEmpty()) return "";
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public void greeting() {
        System.out.println("Здравствуйте! Держите меню, выберете один из наших салатов\n");
        for (int i = 0; i < Menu.getMenu().size(); i++) {
            System.out.println(Menu.getMenu().get(i));
        }
    }

    public Waiter() {
    }

    public void takeOrder(String dishName) {
        this.dishName = dishName;
    }

    public void takeSalatFromChef(Salat salat) {
        this.salat = salat;
    }

    public void checkMenu() {
        menu = Menu.getMenu();
        for (String o : Menu.getMenu()) {
            if (dishName.equals(o)) {
                System.out.println("\nВаш заказ принят:)");
                break;
            }
        }
    }

    public String giveTaskToChef() {
        return dishName;
    }

    public void calculateCalories() {
        List<Vegetable> listByCalories;
        listByCalories = salat.getIngridients();
        Collections.sort(listByCalories, Comparators.CALORIE);

        double TotalCallories = 0;
        System.out.println("Позвольте рассказать вам немного о салате:)\n");
        for (int i = listByCalories.size() - 1; i >= 0; i--) {
            System.out.println(" Количество каллорий в 100гр продукта " + firstUpperCase(listByCalories.get(i).getName()) + " - " + listByCalories.get(i).getCalorie());
        }
        for (int i = 0; i < listByCalories.size(); i++) {
            TotalCallories = listByCalories.get(i).getCalorie() + TotalCallories;
        }
        System.out.println("\n Общее количество каллорий в 100гр салата " + TotalCallories);
        System.out.println("\nПриятного аппетита!");
    }
}


