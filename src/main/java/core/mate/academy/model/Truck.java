package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String name;
    private String color;
    private int yearOfProduction;
    private int maximumCargoWeight;

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
