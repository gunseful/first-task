import vegetables.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Chef {
    public void makingSalat() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Здравствуйте! Какой салат вам приготовить?");
        double totalCalorie = 0;
        int totalPrice = 0;
        ArrayList<Vegetable> list = new ArrayList<Vegetable>();

        while (true) {
            System.out.println("Введите овощь(на английском пожалуйста, мы же не вонючие русские):");
            System.out.println("чтобы закончить собирать салат введи - over");
            String receivedString = reader.readLine().toLowerCase();
            if (receivedString.equals("over")) {
                System.out.println("окей, начинаем готовить:)");
                Thread.sleep(2000);
                break;
            }
            System.out.println("Вес(в граммах):");
            int weightGained = 0;
            try {
                weightGained = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите пожалуйста число, а не хуйню какую-то");
                receivedString = "хуйня";
            }
            if (receivedString.equals("tomato")) {
                System.out.println("Хм, помидор?! отличный выбор:)");
                Vegetable tomato = new Tomato(weightGained);
                list.add(tomato);
            } else if (receivedString.equals("onion")) {
                System.out.println("а я вот не любитель лука...бывают же извращенцы");
                Vegetable onion = new Onion(weightGained);
                list.add(onion);
            } else if (receivedString.equals("mushroom")) {
                Vegetable mushroom = new Mushroom(weightGained);
                list.add(mushroom);
            } else if (receivedString.equals("garlic")) {
                System.out.println("как теперь ты после этого с бабой сосаться собрался?");
                Vegetable garlic = new Garlic(weightGained);
                list.add(garlic);
            } else if (receivedString.equals("carrot")) {
                System.out.println("говорят от нее зрение улучшиться... и писька стоять будет");
                Vegetable carrot = new Carrot(weightGained);
                list.add(carrot);
            } else if (receivedString.equals("sweet paper")) {
                System.out.println("Ред хОт ЧиЛлИ ПЕПЕРС!!! а стоп, ты заказал болгарский:(");
                Vegetable sweetPaper = new SweetPaper(weightGained);
                list.add(sweetPaper);
            } else if (receivedString.equals("cucumber")) {
                System.out.println("хех, хорошо мы сразу салат потом из него сделаем, а то не известно куда бы ты его сунул");
                Vegetable cucumber = new Cucumber(weightGained);
                list.add(cucumber);
            } else if (receivedString.equals("radish")) {
                Vegetable radish = new Radish(weightGained);
                System.out.println("нормас, обожаю");
                list.add(radish);
            } else {
                System.out.println("Овощь не найден, попробуйте еще раз");
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int someWeight = list.get(i).getWeight();
            double someColories = list.get(i).getCalorie();
            int someCost = list.get(i).getCost();
            totalCalorie = totalCalorie + (((double) someWeight) / 100) * someColories;
            totalPrice = totalPrice + someWeight / 100 * someCost;
        }

        for (int i = 0; i < list.size(); i++) {
            for (int n = 1; n < list.size(); n++) {
                if (list.get(n).getCalorie() > list.get(n - 1).getCalorie()) {
                    Vegetable less = list.get(n - 1);
                    Vegetable more = list.get(n);
                    list.remove(n - 1);
                    list.add(n - 1, more);
                    list.remove(n);
                    list.add(n, less);
                }
            }
        }
        System.out.println("Так ну чо получился у нас салат пиздатый. Ща расскажу про него");
        System.out.println("Короче вот список продуктов что ты выбрал и каллории которые они содержут, отсортировал для тебя родной:");
        for (int i = 0; i < list.size(); i++) {
            double caloriesOfProduct = (list.get(i).getCalorie() * list.get(i).getWeight() / 100);
            System.out.println(list.get(i).getName() + " Количество каллорий - " + caloriesOfProduct);
        }
        System.out.println("\nОбщее количество каллорий = " + totalCalorie);
        System.out.println("Ну и цена твоего салатика = " + totalPrice + " рублей");
        System.out.println("\nТак ты хочешь найти овощи из заданого диапазона - пожалуйста. Вводи со скольки будем искать");
        double firstNumOfRange = Double.parseDouble(reader.readLine());
        System.out.println("Так, пиздато, ну до скольки");
        double secondNumOfRange = Double.parseDouble(reader.readLine());
        for (int i = 0; i < list.size(); i++) {
            double caloriesOfProduct = (list.get(i).getCalorie() * list.get(i).getWeight() / 100);
            if (caloriesOfProduct > firstNumOfRange && caloriesOfProduct < secondNumOfRange) {
                System.out.println(list.get(i).getName() + " Количество каллорий - " + caloriesOfProduct);
            }
        }
    }
}
