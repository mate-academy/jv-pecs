package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int horsePower;

    public Truck(String name, String color, int horsePower) {
        super(color, name);
        this.horsePower = horsePower;
    }

    public Truck() {

    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
