package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int scoopVolume;

    public Excavator() {
    }

    public Excavator(int scoopVolume, String name, String color) {
        super(name, color);
        this.scoopVolume = scoopVolume;
    }

    public int getScoopVolume() {
        return scoopVolume;
    }

    public void setScoopVolume(int scoopVolume) {
        this.scoopVolume = scoopVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
