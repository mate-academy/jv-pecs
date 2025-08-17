package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double diggingSpeed;
    private double turnSpeed;

    public Excavator() {
    }

    public double getDiggingSpeed() {
        return diggingSpeed;
    }

    public void setDiggingSpeed(double diggingSpeed) {
        this.diggingSpeed = diggingSpeed;
    }

    public double getTurnSpeed() {
        return turnSpeed;
    }

    public void setTurnSpeed(double turnSpeed) {
        this.turnSpeed = turnSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
