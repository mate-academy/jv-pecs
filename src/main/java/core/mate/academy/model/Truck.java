package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String producer;
    private int engineVolume;
    private int mileage;

    public Truck() {
    }

    public Truck(String producer, int engineVolume, int mileage) {
        this.producer = producer;
        this.engineVolume = engineVolume;
        this.mileage = mileage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
