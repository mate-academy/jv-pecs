package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketVolume;
    private int engineVolume;

    public Excavator() {
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
