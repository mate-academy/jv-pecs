package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private double scoopVolume;
    private double diggingRadius;

    public Excavator() {
    }

    public Excavator(String name, String color, double scoopVolume, double diggingRadius) {
        super(name, color);
        this.scoopVolume = scoopVolume;
        this.diggingRadius = diggingRadius;
    }

    public double getScoopVolume() {
        return scoopVolume;
    }

    public void setScoopVolume(double scoopVolume) {
        this.scoopVolume = scoopVolume;
    }

    public double getDiggingRadius() {
        return diggingRadius;
    }

    public void setDiggingRadius(double diggingRadius) {
        this.diggingRadius = diggingRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
