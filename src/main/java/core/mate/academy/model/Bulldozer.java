package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSize;
    private double enginePower;
    private double maximumSpeed;

    public Bulldozer() {
    }

    public Bulldozer(int bladeSize, double enginePower, double maximumSpeed) {
        this.bladeSize = bladeSize;
        this.enginePower = enginePower;
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
