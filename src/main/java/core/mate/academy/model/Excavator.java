package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String brand;
    private int power;

    public Excavator() {
    }

    public Excavator(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
