import Salats.CaesarSalat;
import Salats.HuyalatSalat;
import Salats.SummerSalat;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Chef chef = new Chef();
        chef.Greeting();

        chef.makingSummerSalat(new SummerSalat());
        chef.makingCaesarSalat(new CaesarSalat());
        chef.makingHuyalatSalat(new HuyalatSalat());
    }
}

