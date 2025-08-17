package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double weight;
    private double length;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double weight, double length) {
        super(name, color);
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
