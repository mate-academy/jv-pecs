package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double maxTractionForce;

    public Bulldozer() {
    }

    public void setMaxTractionForce(double maxTractionForce) {
        this.maxTractionForce = maxTractionForce;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
