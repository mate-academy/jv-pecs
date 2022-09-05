package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String brand;
    private int engineCapacity;
    private boolean isWorking;

    public Excavator() {
    }

    public Excavator(String brand, int engineCapacity) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        isWorking = true;
        System.out.println("Excavator " + brand + " started to work");
    }
}
