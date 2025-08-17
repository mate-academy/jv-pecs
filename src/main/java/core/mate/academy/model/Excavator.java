package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int power;
    private String modification;

    public Excavator() {
    }

    public Excavator(int power, String modification) {
        this.power = power;
        this.modification = modification;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
