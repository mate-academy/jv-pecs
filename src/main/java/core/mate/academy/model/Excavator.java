package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double dipperLength;

    public Excavator() {
    }

    public Excavator(String name, String color, double dipperLength) {
        super(name, color);
        this.dipperLength = dipperLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getDipperLength() {
        return dipperLength;
    }

    public void setDipperLength(double dipperLength) {
        this.dipperLength = dipperLength;
    }
}
