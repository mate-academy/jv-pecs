package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String brand;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(String brand, double bucketCapacity, String name, String color) {
        this.brand = brand;
        this.bucketCapacity = bucketCapacity;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
