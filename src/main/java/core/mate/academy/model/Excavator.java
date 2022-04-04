package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double liftForce;

    public Excavator() {
    }

    public Excavator(String name, String color, double liftForce) {
        super(name, color);
        this.liftForce = liftForce;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getLiftForce() {
        return liftForce;
    }

    public void setLiftForce(double liftForce) {
        this.liftForce = liftForce;
    }
}
