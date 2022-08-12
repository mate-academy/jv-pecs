package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double backetVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, double backetVolume) {
        this.backetVolume = backetVolume;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
