package vegetables;

public class Radish extends Vegetable {

    private String name = "Radish";
    private int calorie = 34;
    private int cost = 8;
    private int weight;

    public Radish(int weight) {
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
