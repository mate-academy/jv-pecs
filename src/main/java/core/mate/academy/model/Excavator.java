package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int loadingHeight;

    public Excavator() {
    }

    public Excavator(String name, String color, int loadingHeight) {
        super(name, color);
        this.loadingHeight = loadingHeight;
    }

    public int getLoadingHeight() {
        return loadingHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
