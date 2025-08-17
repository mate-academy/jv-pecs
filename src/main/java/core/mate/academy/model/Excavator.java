package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String bucketType;
    private String boomType;

    public Excavator() {
    }

    public Excavator(String name, String color, String bucketType, String boomType) {
        setName(name);
        setColor(color);
        this.bucketType = bucketType;
        this.boomType = boomType;
    }

    public String getBucketType() {
        return bucketType;
    }

    public String getBoomType() {
        return boomType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
