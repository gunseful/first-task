package vegetables;

public class Mushroom extends Vegetable {
    private String name = "Mushroom";
    private int calorie = 25;
    private int cost = 20;
    private int weight;

    public Mushroom(int weight) {
        super();
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
