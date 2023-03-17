package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int buckedVolume;

    public Excavator(String name, String color, int buckedVolume) {
        super(name, color);
        this.buckedVolume = buckedVolume;
    }

    public Excavator() {
        super();
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBuckedVolume() {
        return buckedVolume;
    }

    public void setBuckedVolume(int buckedVolume) {
        this.buckedVolume = buckedVolume;
    }
}
