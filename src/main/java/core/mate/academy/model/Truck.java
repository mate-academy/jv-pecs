package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxDistance;
    private String typeOfFuel;

    public Truck() {
    }

    public Truck(int maxDistance, String typeOfFuel) {
        this.maxDistance = maxDistance;
        this.typeOfFuel = typeOfFuel;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
