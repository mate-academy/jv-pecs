package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String workingSurface;

    public Excavator() {
    }

    public String getWorkingSurface() {
        return workingSurface;
    }

    public void setWorkingSurface() {
        this.workingSurface = workingSurface;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
