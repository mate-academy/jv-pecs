package core.mate.academy.model;
public class Truck extends Machine {
    private String bodyType;
    private int carryingCapacity;
    private int wheelsNumber;
    public Truck() {
    }
    public Truck(String bodyType, int carryingCapacity, int wheelsNumber) {
        this.bodyType = bodyType;
        this.carryingCapacity = carryingCapacity;
        this.wheelsNumber = wheelsNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
