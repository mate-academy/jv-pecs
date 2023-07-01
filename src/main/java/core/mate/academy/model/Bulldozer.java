package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bucketVolume;

    public Bulldozer() {
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
