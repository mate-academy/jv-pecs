package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private double bladeCapacity;
    private int operatingWeight;

    public Bulldozer() {
    }

    public Bulldozer(String bladeType, double bladeCapacity, int operatingWeight) {
        this.bladeType = bladeType;
        this.bladeCapacity = bladeCapacity;
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
