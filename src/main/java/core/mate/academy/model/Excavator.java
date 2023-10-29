package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public static final int MIN_DIGGING_DEPTH = 1;
    public static final int MAX_DIGGING_DEPTH = 20;
    private int diggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, int power, int diggingDepth) {
        super(name, color, power);
        this.diggingDepth = diggingDepth;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
