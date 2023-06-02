package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeOfTruck;

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    public void setTypeOfTruck(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public int getWeightOfTruck() {
        return weightOfTruck;
    }

    public void setWeightOfTruck(int weightOfTruck) {
        this.weightOfTruck = weightOfTruck;
    }

    public int getCapacityOfTruck() {
        return capacityOfTruck;
    }

    public void setCapacityOfTruck(int capacityOfTruck) {
        this.capacityOfTruck = capacityOfTruck;
    }

    private int weightOfTruck;
    private int capacityOfTruck;
    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
