package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int power;
    private double scoopVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, int power, double scoopVolume) {
        super(name, color);
        this.power = power;
        this.scoopVolume = scoopVolume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getScoopVolume() {
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
