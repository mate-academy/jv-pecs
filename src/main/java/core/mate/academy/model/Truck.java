package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String typeTruck;
    private String cabOptions;
    private double bodyVolume;

    public Truck() {
    }

    public String getTypeTruck() {
        return typeTruck;
    }

    public void setTypeTruck(String typeTruck) {
        this.typeTruck = typeTruck;
    }

    public String getCabOptions() {
        return cabOptions;
    }

    public void setCabOptions(String cabOptions) {
        this.cabOptions = cabOptions;
    }

    public double getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(double bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
