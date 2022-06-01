package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {

    private int maximumDiggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, int maximumDiggingDepth) {
        super.setName(name);
        super.setColor(color);
        this.maximumDiggingDepth = maximumDiggingDepth;
    }

    public int getMaximumDiggingDepth() {
        return maximumDiggingDepth;
    }

    public void setMaximumDiggingDepth(int maximumDiggingDepth) {
        this.maximumDiggingDepth = maximumDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
