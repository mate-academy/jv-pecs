package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String storageCapacity;
    private boolean dumpCapable;

    public Truck() {
    }

    public Truck(String storageCapacity, boolean dumpCapable) {
        this.storageCapacity = storageCapacity;
        this.dumpCapable = dumpCapable;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public boolean isDumpCapability() {
        return dumpCapable;
    }

    public void setDumpCapability(boolean dumpCapability) {
        this.dumpCapable = dumpCapability;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
