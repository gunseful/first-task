package people;

public class Visitor {
    private String salatName;

    public String getSalatName() {
        return salatName;
    }

    public void chooseSalat(String salatName) {
        salatName = salatName.toLowerCase();
        this.salatName = salatName;

    }
}
