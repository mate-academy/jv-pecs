package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int lengthCapacity;
    private int quantityWheels;

    public Truck() {
    }

    public int getLengthCapacity() {
        return lengthCapacity;
    }

    public void setLengthCapacity(int lengthCapacity) {
        this.lengthCapacity = lengthCapacity;
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
