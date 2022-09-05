package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private int engineCapacity;
    private boolean isWorking;

    public Bulldozer() {
    }

    public Bulldozer(String brand, int engineCapacity) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        isWorking = true;
        System.out.println("Bulldozer " + brand + " started to work");
    }
}
