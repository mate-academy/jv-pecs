package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeMachine;
    private String typeTruck;
    private int speed;

    public Truck() {
    }

    public Truck(String typeMachine, String typeTruck, int speed) {
        this.typeMachine = typeMachine;
        this.typeTruck = typeTruck;
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
