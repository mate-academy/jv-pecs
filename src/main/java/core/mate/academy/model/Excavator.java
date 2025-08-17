package core.mate.academy.model;

public class Excavator extends Machine {

    private int operatingWeight;
    private int powerEngine;

    public Excavator() {
    }

    public Excavator(String name, String color, int operatingWeight, int powerEngine) {
        super(name, color);
        this.operatingWeight = operatingWeight;
        this.powerEngine = powerEngine;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
