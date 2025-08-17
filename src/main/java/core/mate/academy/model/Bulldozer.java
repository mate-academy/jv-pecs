package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private double bladeCapacity;
    private int operatingWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bladeType, double bladeCapacity,
                     int operatingWeight) {
        super(name, color);
        this.bladeType = bladeType;
        this.bladeCapacity = bladeCapacity;
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
