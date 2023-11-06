package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxPayload;

    public Truck() {
    }

    public Truck(String name, String color, int maxPayload) {
        super.setName(name);
        super.setColor(color);
        this.maxPayload = maxPayload;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{name -"
                + super.getName()
                + ", color - "
                + super.getColor()
                + ", max payload ="
                + maxPayload
                + '}';
    }

    public int getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(int maxPayload) {
        this.maxPayload = maxPayload;
    }
}
