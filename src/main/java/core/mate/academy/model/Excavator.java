package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String power;

    public Excavator() {

    }

    public Excavator(String power, String color, String name) {
        super(color, name);
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
