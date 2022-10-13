package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    public static final int DEFAULT_HEIGHT = 15;

    private int height = DEFAULT_HEIGHT;

    public Excavator() {
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println(height + " meter excavator started to work");
    }
}
