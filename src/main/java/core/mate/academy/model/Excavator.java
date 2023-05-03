package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double power;

    public Excavator() {
    }

    public Excavator(double power, String color, String name) {
        this.power = power;
        setColor(color);
        setName(name);
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work.");
    }
}
