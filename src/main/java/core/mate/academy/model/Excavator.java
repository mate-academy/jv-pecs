package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double backetVolume;

    public Excavator() {
    }

    public double getBacketVolume() {
        return backetVolume;
    }

    public void setBacketVolume(double backetVolume) {
        this.backetVolume = backetVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
