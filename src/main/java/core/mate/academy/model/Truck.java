package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cost;

    public Truck(){
    }

    public Truck(String color, String name, int cost) {
        super(color, name);
        this.cost = cost;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
