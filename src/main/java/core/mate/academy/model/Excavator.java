package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double immersionDepth;

    public Excavator(String name, String color, double immersionDepth) {
        this.setName(name);
        this.setColor(color);
        this.immersionDepth = immersionDepth;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getImmersionDepth() {
        return immersionDepth;
    }

    public void setImmersionDepth(double immersionDepth) {
        this.immersionDepth = immersionDepth;
    }
}
