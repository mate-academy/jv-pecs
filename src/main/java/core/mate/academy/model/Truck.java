package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean trailer;
    private int maxCarryingCapacity;
    private String type;

    public Truck() {
    }

    public Truck(boolean trailer, int maxCarryingCapacity, String type) {
        this.trailer = trailer;
        this.maxCarryingCapacity = maxCarryingCapacity;
        this.type = type;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public int getMaxCarryingCapacity() {
        return maxCarryingCapacity;
    }

    public void setMaxCarryingCapacity(int maxCarryingCapacity) {
        this.maxCarryingCapacity = maxCarryingCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
