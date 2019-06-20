package vegetables;

public class Tomato extends Vegetable {

    String name = "помидор";
    double calorie = 19.89;
    int cost = 10;
    int weight;

    public Tomato(int weight) {
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
