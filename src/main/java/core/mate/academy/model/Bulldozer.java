package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements Workable{
    private int bucketCapacity;
    private String bucket;

    public Bulldozer(int bucketCapacity, String bucket) {
        this.bucketCapacity = bucketCapacity;
        this.bucket = bucket;
    }

    public Bulldozer() {
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
