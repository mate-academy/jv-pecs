package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int heightOfTruck;
    private int weighOfTruck;
    private int hoursOfWorkTruck;

    public Truck() {
    }

    public Truck(String name, String color,
                 int weighOfTruck, int heightOfTruck, int hoursOfWorkTruck) {
        super(name, color);
        this.weighOfTruck = weighOfTruck;
        this.heightOfTruck = heightOfTruck;
        this.hoursOfWorkTruck = hoursOfWorkTruck;

    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
