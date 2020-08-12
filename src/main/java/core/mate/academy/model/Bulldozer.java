package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int enginePower;
    private double operatingW;

    public Bulldozer() {
    }

    public Bulldozer(int enginePower, double operatingW) {
        this.enginePower = enginePower;
        this.operatingW = operatingW;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getOperatingW() {
        return operatingW;
    }

    public void setOperatingW(double operatingW) {
        this.operatingW = operatingW;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
