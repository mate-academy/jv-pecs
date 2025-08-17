package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private String trackShoeWidth;
    private String model;

    public Excavator() {
    }

    public Excavator(String name, String color, String trackShoeWidth, String model) {
        super(name, color);
        this.trackShoeWidth = trackShoeWidth;
        this.model = model;
    }

    public String getTrackShoeWidth() {
        return trackShoeWidth;
    }

    public void setTrackShoeWidth(String trackShoeWidth) {
        this.trackShoeWidth = trackShoeWidth;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
