package vegetables;

public class SweetPaper extends Vegetable {

    private String name = "болгарский перец";
    private int calorie = 40;
    private int cost = 5;
    private int weight;

    public SweetPaper(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getCalorie() {
        return calorie;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }
}
