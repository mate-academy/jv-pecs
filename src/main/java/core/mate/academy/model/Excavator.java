package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String scoop;

    public Excavator() {
    }

    public Excavator(String name, String color, String scoop) {
        super(name, color);
        this.scoop = scoop;
    }

    public String getScoop() {
        return scoop;
    }

    public void setScoop(String scoop) {
        this.scoop = scoop;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
