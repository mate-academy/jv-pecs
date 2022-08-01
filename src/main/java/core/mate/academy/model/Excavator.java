package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String dipperType;

    public Excavator() {
    }

    public Excavator(String name, String color, String dipperType) {
        setName(name);
        setColor(color);
        this.dipperType = dipperType;
    }

    public String getDipperType() {
        return dipperType;
    }

    public void setDipperType(String dipperType) {
        this.dipperType = dipperType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
