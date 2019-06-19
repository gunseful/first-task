public class Cucumber extends Vegetable{

    private String name = "Cucumber";
    private double calorie = 13.5;
    private int cost = 15;
    private int weight;

    public Cucumber(int weight) {
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
