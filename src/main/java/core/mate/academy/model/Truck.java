package core.mate.academy.model;

public class Truck extends Machine {
    private String categoryByLoadCapacity;
    private int numOfVehicles;

    public Truck() {
    }

    public Truck(String categoryByLoadCapacity, int numOfVehicles) {
        this.categoryByLoadCapacity = categoryByLoadCapacity;
        this.numOfVehicles = numOfVehicles;
    }

    public String getCategoryByLoadCapacity() {
        return categoryByLoadCapacity;
    }

    public void setCategoryByLoadCapacity(String categoryByLoadCapacity) {
        this.categoryByLoadCapacity = categoryByLoadCapacity;
    }

    public int getNumOfVehicles() {
        return numOfVehicles;
    }

    public void setNumOfVehicles(int numOfVehicles) {
        this.numOfVehicles = numOfVehicles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
