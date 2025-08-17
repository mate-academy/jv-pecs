package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private int power;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String model, int power, int weight) {
        this.model = model;
        this.power = power;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String getColor() {
        return model;
    }

    @Override
    public void setColor(String color) {
        this.model = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
