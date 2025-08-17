package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bucketDepth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bucketDepth) {
        super(name, color);
        this.bucketDepth = bucketDepth;
    }

    public String getBucketDepth() {
        return bucketDepth;
    }

    public void setBucketDepth(String bucketDepth) {
        this.bucketDepth = bucketDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
