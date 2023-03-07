package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int volumeOfLadle;

    public Excavator() {

    }

    public Excavator(String name, String color, String model, int year, int volumeOfLadle) {
        super(name, color, model, year);
        this.volumeOfLadle = volumeOfLadle;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getVolumeOfLadle() {
        return volumeOfLadle;
    }

    public void setVolumeOfLadle(int volumeOfLadle) {
        this.volumeOfLadle = volumeOfLadle;
    }
}
