package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int loadCapacity;
    private String typeTrailer;
    private int weightMachine;

    public Truck() {
    }

    public Truck(int maxSpeed, int loadCapacity, String typeTrailer, int weightMachine) {
        this.maxSpeed = maxSpeed;
        this.loadCapacity = loadCapacity;
        this.typeTrailer = typeTrailer;
        this.weightMachine = weightMachine;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
