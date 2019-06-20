package Menu;

import salats.*;

import java.util.HashMap;

public class Menu {
    HashMap<String, Salat> salatMap = new HashMap<>();

    public HashMap<String, Salat> getMenu() {
        salatMap.put("цезарь", new CaesarSalat());
        salatMap.put("хуялат", new HuyalatSalat());
        salatMap.put("летний", new SummerSalat());
        salatMap.put("хз салат", new HzSalat());

        return salatMap;
    }
}
