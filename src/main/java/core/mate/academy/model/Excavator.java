package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double power;
    private String superPower;

    public Excavator() {
    }

    public Excavator(String name, String color, double power, String superPower) {
        super(name, color);
        this.power = power;
        this.superPower = superPower;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
