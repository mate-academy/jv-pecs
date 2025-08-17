package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double shovelVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, double shovelVolume) {
        super(name, color);
        this.shovelVolume = shovelVolume;
    }

    public double getShovelVolume() {
        return shovelVolume;
    }

    public void setShovelVolume(double shovelVolume) {
        this.shovelVolume = shovelVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
