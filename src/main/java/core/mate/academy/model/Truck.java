package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int manufactureYear;

    public Truck(String name, String color, int manufactureYear) {
        super(name, color);
        this.manufactureYear = manufactureYear;
    }

    public Truck() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
