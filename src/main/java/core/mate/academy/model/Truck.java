package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int longVehicle;
    private boolean isRoadTrain;

    public Truck() {
    }

    public Truck(String name, String color, int longVehicle, boolean isRoadTrain) {
        setName(name);
        setColor(color);
        this.longVehicle = longVehicle;
        this.isRoadTrain = isRoadTrain;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
