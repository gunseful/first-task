import people.Chef;
import people.Visitor;
import people.Waiter;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Visitor visitor = new Visitor();

        Waiter waiter = new Waiter();
        waiter.greeting();

        visitor.chooseSalat("ЦеЗарЬ");
        waiter.takeOrder(visitor.getSalatName());

        Chef chef = new Chef();
        chef.makingSalat(waiter.tranferOrderToChef());
        waiter.calculateCalories();
    }




}

