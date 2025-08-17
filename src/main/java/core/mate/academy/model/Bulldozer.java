package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String runningBase;
    private String liftMechanism;
    private double operatingWeight;

    public Bulldozer() {
    }

    public Bulldozer(String runningBase, String liftMechanism, double operatingWeight) {
        this.runningBase = runningBase;
        this.liftMechanism = liftMechanism;
        this.operatingWeight = operatingWeight;
    }

    public String getRunningBase() {
        return runningBase;
    }

    public void setRunningBase(String runningBase) {
        this.runningBase = runningBase;
    }

    public String getLiftMechanism() {
        return liftMechanism;
    }

    public void setLiftMechanism(String liftMechanism) {
        this.liftMechanism = liftMechanism;
    }

    public double getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(double operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
