package vegetables;

public class Garlic extends Vegetable {

    private String name = "чеснок";
    private int calorie = 106;
    private int cost = 2;
    private int weight;

    public Garlic(int weight) {
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
