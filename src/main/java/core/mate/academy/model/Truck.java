package core.mate.academy.model;

public class Truck extends Machine {
    private String brand;
    private int engineCapacity;
    private boolean isWorking;

    public Truck() {
    }

    public Truck(String brand, int engineCapacity) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        isWorking = true;
        System.out.println("Truck " + brand + " started to work");
    }
}
