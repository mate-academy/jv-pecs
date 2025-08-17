package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int backedCapacity;

    public Excavator() {
    }

    public Excavator(int backedCapacity) {
        this.backedCapacity = backedCapacity;
    }

    public int getBackedCapacity() {
        return backedCapacity;
    }

    public void setBackedCapacity(int backedCapacity) {
        this.backedCapacity = backedCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator with backed capacity "
                + backedCapacity + " started to work");
    }
}
