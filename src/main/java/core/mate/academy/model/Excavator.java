package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int engineCapacity;

    public Excavator() {
    }

    public Excavator(int engineCapacity, String name, String color) {
        this.engineCapacity = engineCapacity;
        setName(name);
        setColor(color);
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
