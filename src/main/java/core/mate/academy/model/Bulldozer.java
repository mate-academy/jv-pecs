package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String color;
    private int weight;
    private int power;

    public Bulldozer() {
        color = "Yellow";
        weight = 15;
        power = 1000;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
