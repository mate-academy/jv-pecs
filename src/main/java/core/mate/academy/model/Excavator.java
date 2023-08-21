package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean suitableForMining;
    private int armLength;

    public Excavator() {
    }

    public Excavator(boolean suitableForMining, int armLength) {
        this.suitableForMining = suitableForMining;
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
