package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public Excavator() {
    }

    public Excavator(String serialNumber, int strength) {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
