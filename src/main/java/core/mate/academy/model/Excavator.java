package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double scoopVolume;
    private int power;
    private int weight;

    public Excavator() {
    }

    public Excavator(String name, String color, double scoopVolume, int power, int weight) {
        super(name, color);
        this.scoopVolume = scoopVolume;
        this.power = power;
        this.weight = weight;
    }

    public double getScoopVolume() {
        return scoopVolume;
    }

    public void setScoopVolume(double scoopVolume) {
        this.scoopVolume = scoopVolume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
