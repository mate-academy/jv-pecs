package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bulldozerModel;
    private int bucketBulldozerCapacity;

    public Bulldozer() {
    }

    public String getBulldozerModel() {
        return bulldozerModel;
    }

    public void setBulldozerModel(String bulldozerModel) {
        this.bulldozerModel = bulldozerModel;
    }

    public int getBucketBulldozerCapacity() {
        return bucketBulldozerCapacity;
    }

    public void setBucketBulldozerCapacity(int bucketBulldozerCapacity) {
        this.bucketBulldozerCapacity = bucketBulldozerCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
