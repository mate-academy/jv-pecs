package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearOfProduction;
    private int maximumCargoWeight;

    public Truck() {
    }

    public Truck(String name, String color, int yearOfProduction, int maximumCargoWeight) {
        super(name, color);
        this.yearOfProduction = yearOfProduction;
        this.maximumCargoWeight = maximumCargoWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
