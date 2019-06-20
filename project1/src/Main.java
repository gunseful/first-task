import people.Chef;
import people.Visitor;
import people.Waiter;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Visitor visitor = new Visitor();

        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        waiter.greeting();

        visitor.chooseSalat("Цезарь");
        waiter.takeOrder(visitor.getSalatName());
        waiter.checkMenu();


        chef.takeTaskFromWaiter(waiter.giveTaskToChef());
        chef.makingSalat();
        waiter.calculateCalories();
    }




}

