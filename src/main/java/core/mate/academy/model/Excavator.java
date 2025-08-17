package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int scoopingRadius;

    public Excavator() {
    }

    public Excavator(String name, String color, int scoopingRadius) {
        setName(name);
        setColor(color);
        this.scoopingRadius = scoopingRadius;
    }

    public int getScoopingRadius() {
        return scoopingRadius;
    }

    public void setScoopingRadius(int scoopingRadius) {
        this.scoopingRadius = scoopingRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
