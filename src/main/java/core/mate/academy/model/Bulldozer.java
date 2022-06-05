package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucketWidth;
    private int bucketHeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bucketWidth, int bucketHeight) {
        super.setName(name);
        super.setColor(color);
        this.bucketWidth = bucketWidth;
        this.bucketHeight = bucketHeight;
    }

    public int getBucketWidth() {
        return bucketWidth;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    public int getBucketHeight() {
        return bucketHeight;
    }

    public void setBucketHeight(int bucketHeight) {
        this.bucketHeight = bucketHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
