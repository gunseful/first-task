package menu;

import salats.*;

public enum Kitchen {
    BOCH("бочарников", new BocharnikovSalat()),
    CAESAR("цезарь", new CaesarSalat()),
    HYALAT("хуялат", new HuyalatSalat()),
    SUMMER("летний", new SummerSalat());

    private String name;
    private Salat salat;

    Kitchen(String title, Salat salat) {
        this.name = title;
        this.salat = salat;
    }

    public String getName() {
        return name;
    }

    public Salat getSalat() {
        return salat;
    }
}
