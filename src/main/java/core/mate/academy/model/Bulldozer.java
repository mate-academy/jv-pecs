package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double operatingWeight;
    private boolean isHydraulics;

    public Bulldozer(double operatingWeight, boolean isHydraulics) {
        this.operatingWeight = operatingWeight;
        this.isHydraulics = isHydraulics;
    }

    public Bulldozer() {
    }

    public double getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(double operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    public boolean isHydraulics() {
        return isHydraulics;
    }

    public void setHydraulics(boolean hydraulics) {
        isHydraulics = hydraulics;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
