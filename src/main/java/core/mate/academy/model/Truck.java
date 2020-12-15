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

    public Truck(String name, String color, String typeMachine, String typeTruck, int speed) {
        super(name, color);
        this.typeMachine = typeMachine;
        this.typeTruck = typeTruck;
        this.speed = speed;
    }

    public String getTypeMachine() {
        return typeMachine;
    }

    public String getTypeTruck() {
        return typeTruck;
    }

    public int getSpeed() {
        return speed;
    }

    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }

    public void setTypeTruck(String typeTruck) {
        this.typeTruck = typeTruck;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
