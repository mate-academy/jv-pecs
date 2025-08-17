package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;
    private double maxDiggingDepth;

    public Excavator() {
        super();
    }

    public Excavator(String name, String color, int bucketSize, int maxDiggingDepth) {
        super(name, color);
        this.bucketSize = bucketSize;
        this.maxDiggingDepth = maxDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
