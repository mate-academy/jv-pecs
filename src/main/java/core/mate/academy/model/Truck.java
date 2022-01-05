package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String trailerType;
    private String bodyType;
    private int carrying;

    public Truck() {
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public void bucketVolume(double v) {

    }

    @Override
    public void setLoadCapacity(int i) {

    }
}
