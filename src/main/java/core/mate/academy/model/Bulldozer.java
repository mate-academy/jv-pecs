package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucket;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bucket) {
        this.setName(name);
        this.setColor(color);
        this.bucket = bucket;
    }

    public int getBucket() {
        return bucket;
    }

    public void setBucket(int bucket) {
        this.bucket = bucket;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
