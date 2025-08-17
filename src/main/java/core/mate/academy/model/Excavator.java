package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean hasTracks;
    private boolean isRotating;

    public Excavator() {
    }

    public Excavator(boolean hasTracks, boolean isRotating) {
        this.hasTracks = hasTracks;
        this.isRotating = isRotating;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
