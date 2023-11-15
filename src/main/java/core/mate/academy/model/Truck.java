package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int payloadCapacity;
    private int fuelCapacity;
    private String typeOfTruck;

    public Truck() {

    }

    public Truck(int payloadCapacity, int fuelCapacity, String typeOfTruck) {
        setPayloadCapacity(payloadCapacity);
        setFuelCapacity(fuelCapacity);
        setTypeOfTruck(typeOfTruck);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }
}
