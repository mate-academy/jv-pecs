package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private int width;
    private int trackLength;

    public Excavator(String model, int width, int trackLength) {
        this.model = model;
        this.width = width;
        this.trackLength = trackLength;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
