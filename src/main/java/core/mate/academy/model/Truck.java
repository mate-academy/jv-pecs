package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerVolume;
    private String trailerType;

    public Truck() {
    }

    public Truck(int trailerVolume, String trailerType) {
        this.trailerVolume = trailerVolume;
        this.trailerType = trailerType;
    }

    public int getTrailerVolume() {
        return trailerVolume;
    }

    public void setTrailerVolume(int trailerVolume) {
        this.trailerVolume = trailerVolume;
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
