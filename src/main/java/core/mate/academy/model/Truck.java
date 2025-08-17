package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int horsePower;
    private boolean isAwd;

    public Truck() {
    }

    public Truck(String name, String color, int power, boolean isAwd) {
        super.setName(name);
        super.setColor(color);
        this.horsePower = power;
        this.isAwd = isAwd;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
