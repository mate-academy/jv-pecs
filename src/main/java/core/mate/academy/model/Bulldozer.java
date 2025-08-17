package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double volumePerHour;

    public Bulldozer() {

    }

    public Bulldozer(double volumePerHour) {
        this.volumePerHour = volumePerHour;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getVolumePerHour() {
        return volumePerHour;
    }

    public void setVolumePerHour(double volumePerHour) {
        this.volumePerHour = volumePerHour;
    }
}
