package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int weight;

    public Truck() {
    }

    public Truck(String name, String color, int maxSpeed, int weight) {
        super(name, color);
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
