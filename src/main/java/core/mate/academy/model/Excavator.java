package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int digDepth;

    public Excavator(String name, String color, int trackGauge) {
        super(name, color);
        this.digDepth = digDepth;
    }

    public Excavator() {
    }

    public int getDigDepth() {
        return digDepth;
    }

    public void setDigDepth(int digDepth) {
        this.digDepth = digDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
