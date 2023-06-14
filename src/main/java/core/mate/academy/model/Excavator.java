package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String wheelType;

    public Excavator() {
    }

    public Excavator(String name, String color, String wheelType) {
        setName(name);
        setColor(color);
        this.wheelType = wheelType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }
}
