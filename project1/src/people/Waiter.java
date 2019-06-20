package people;

import Menu.Menu;
import salats.Salat;
import vegetables.Vegetable;

import java.util.List;
import java.util.Map;

public class Waiter {
    private String dishName;

    public void greeting() {
        System.out.println("Здравствуйте! Держите меню, выберете один из наших салатов");
        System.out.println("Салат Летний");
        System.out.println("Цезарь");
        System.out.println("Салат Хуялат\n");
    }

    public Waiter() {
    }

    public String takeOrder(String dishName) {
        System.out.println("Отличный выбор:)");
        this.dishName = dishName;
        return this.dishName;
    }

    public Salat tranferOrderToChef() {
        Menu menu = new Menu();
        menu.getMenu();
        Salat salat = null;
        for (Map.Entry<String, Salat> pair : menu.getMenu().entrySet()) {
            if (dishName.equals(pair.getKey())) {
                salat = pair.getValue();
                break;
            } else salat = null;
        }
        return salat;
    }

    public void calculateCalories() {
        List<Vegetable> listByCalories;
        listByCalories = tranferOrderToChef().getIngridients();
        for (int i = 0; i < listByCalories.size(); i++) {
            for (int n = 1; n < listByCalories.size(); n++) {
                if (listByCalories.get(n).getCalorie() > listByCalories.get(n - 1).getCalorie()) {
                    Vegetable less = listByCalories.get(n - 1);
                    Vegetable more = listByCalories.get(n);
                    listByCalories.remove(n - 1);
                    listByCalories.add(n - 1, more);
                    listByCalories.remove(n);
                    listByCalories.add(n, less);
                }
            }
        }
        double TotalCallories = 0;
        System.out.println("Позвольте рассказать вам немного о салате:)\n");
        for (int i = 0; i < listByCalories.size(); i++) {
            System.out.println(" Количество каллорий в 100гр салата " + listByCalories.get(i).getName() + " - " + listByCalories.get(i).getCalorie());
        }
        for (int i = 0; i < listByCalories.size(); i++) {
            TotalCallories = listByCalories.get(i).getCalorie() + TotalCallories;
        }
        System.out.println("\n Общее количество каллорий в 100гр салата " + TotalCallories);
        System.out.println("\nПриятного аппетита!");
    }
}


