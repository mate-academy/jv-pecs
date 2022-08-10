package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int digDepth;
    private int diggedVolume;

    public Excavator() {
    }

    public Excavator(int digDepth, int diggedVolume) {
        this.digDepth = digDepth;
        this.diggedVolume = diggedVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
