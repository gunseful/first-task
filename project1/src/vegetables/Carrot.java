package vegetables;

public class Carrot extends Vegetable {

    private String name = "Carrot";
    private int calorie = 33;
    private int cost = 5;
    private int weight;

    public Carrot(int weight) {
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
