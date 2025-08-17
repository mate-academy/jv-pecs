package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private String bodyType;
    private String typeOfCargo;

    public Truck() {
    }

    public Truck(int loadCapacity, String bodyType, String typeOfCargo) {
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
        this.typeOfCargo = typeOfCargo;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getTypeOfCargo() {
        return typeOfCargo;
    }

    public void setTypeOfCargo(String typeOfCargo) {
        this.typeOfCargo = typeOfCargo;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
