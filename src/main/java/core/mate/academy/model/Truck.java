package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String engineType;
    private String typeOfCargo;
    private int fuelCapacity;

    public Truck(String engineType, String typeOfCargo, int fuelCapacity) {
        this.engineType = engineType;
        this.typeOfCargo = typeOfCargo;
        this.fuelCapacity = fuelCapacity;
    }

    public Truck() {
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
