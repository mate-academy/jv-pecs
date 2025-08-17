package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String armType;

    public Excavator() {
    }

    public Excavator(String name, String color, String armType) {
        this.setName(name);
        this.setColor(color);
        this.armType = armType;
    }

    public String getArmType() {
        return armType;
    }

    public void setArmType(String armType) {
        this.armType = armType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
