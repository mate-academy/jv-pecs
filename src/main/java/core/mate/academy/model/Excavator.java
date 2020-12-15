package core.mate.academy.model;

public class Excavator extends Machine {
    private String boomType;
    private int bucketCapacity;

    public Excavator() {
    }

    public String getBoomType() {
        return boomType;
    }

    public void setBoomType(String boomType) {
        this.boomType = boomType;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
