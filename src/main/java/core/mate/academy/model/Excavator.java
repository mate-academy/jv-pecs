package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxSpeed;
    private boolean haveExtraEquipment;

    public Excavator() {
    }

    public Excavator(int maxSpeed, boolean haveExtraEquipment) {
        this.maxSpeed = maxSpeed;
        this.haveExtraEquipment = haveExtraEquipment;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
