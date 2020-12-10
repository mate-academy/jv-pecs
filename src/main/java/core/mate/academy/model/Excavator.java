package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean hasTracks;

    public Excavator() {
    }

    public Excavator(String name, String color, boolean hasTracks) {
        super(name, color);
        this.hasTracks = hasTracks;
    }

    public boolean isHasTracks() {
        return hasTracks;
    }

    public void setHasTracks(boolean hasTracks) {
        this.hasTracks = hasTracks;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
