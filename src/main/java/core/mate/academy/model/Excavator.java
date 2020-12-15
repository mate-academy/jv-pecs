package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int tracLength;

    public Excavator() {
    }

    public Excavator(int tracLength) {
        this.tracLength = tracLength;
    }

    public int getTracLength() {
        return tracLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
