import people.Chef;
import people.Visitor;
import people.Waiter;


public class Main {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();

        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        waiter.greeting();

        visitor.chooseSalat("цезарь");
        waiter.takeOrder(visitor.getSalatName());
        waiter.checkMenu();

        chef.takeTaskFromWaiter(waiter.giveTaskToChef());
        chef.makingSalat();

        waiter.takeSalatFromChef(chef.getSalat());
        waiter.calculateCalories();
    }


}

