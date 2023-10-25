package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;
    private boolean isMovableTracks;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketSize, boolean isMovableTracks) {
        super(name, color);
        this.bucketSize = bucketSize;
        this.isMovableTracks = isMovableTracks;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
