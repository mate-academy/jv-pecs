package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String dumpType;
    private float dumpCapacity;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String dumpType, float dumpCapacity) {
        this.setName(name);
        this.setColor(color);
        this.dumpType = dumpType;
        this.dumpCapacity = dumpCapacity;
    }

    public String getDumpType() {
        return dumpType;
    }

    public void setDumpType(String dumpType) {
        this.dumpType = dumpType;
    }

    public float getDumpCapacity() {
        return dumpCapacity;
    }

    public void setDumpCapacity(float dumpCapacity) {
        this.dumpCapacity = dumpCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return "Bulldozer [name= " + getName() + ", color= " + getColor()
                + ", dump type= " + getDumpType() + ", dump capacity= " + getDumpCapacity() + "]";
    }
}
