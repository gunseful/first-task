package menu;

import java.util.ArrayList;

public class Menu {

    public static ArrayList<String> getMenu() {
        ArrayList<String> listOfSalats = new ArrayList<>();
        for (Kitchen o : Kitchen.values()) {
            String salatName = o.getName();
            listOfSalats.add(salatName);
        }
        return listOfSalats;
    }
}
