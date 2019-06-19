public class Onion extends Vegetable{

    private String name = "Onion";
    private int cost = 5;
    private int calorie = 43;
    private int weight;

    public Onion(int weight) {
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
