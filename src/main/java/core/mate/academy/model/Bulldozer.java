package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private String bladeLocation;
    private double fuelTank;
    private double operatingWeight;
    private double groundPressure;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color) {
        super(name, color);
    }

    public Bulldozer(String name, String color, String bladeType, String bladeLocation,
                     double fuelTank, double operatingWeight, double groundPressure) {
        super(name, color);
        this.bladeType = bladeType;
        this.bladeLocation = bladeLocation;
        this.fuelTank = fuelTank;
        this.operatingWeight = operatingWeight;
        this.groundPressure = groundPressure;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public String getBladeLocation() {
        return bladeLocation;
    }

    public void setBladeLocation(String bladeLocation) {
        this.bladeLocation = bladeLocation;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(double operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    public double getGroundPressure() {
        return groundPressure;
    }

    public void setGroundPressure(double groundPressure) {
        this.groundPressure = groundPressure;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
