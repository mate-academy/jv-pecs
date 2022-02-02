package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType;
    private int carryingCapacity;
    private int wheelsNumber;

    public Truck() {
    }

    public Truck(String name, String color,
                 String bodyType, int carryingCapacity, int wheelsNumber) {
        super(name, color);
        this.bodyType = bodyType;
        this.carryingCapacity = carryingCapacity;
        this.wheelsNumber = wheelsNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
