package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucketSize;
    private String bulldozerType;

    public Bulldozer(String name, String color, int bucketSize, String type) {
        super(name,color);
        this.bucketSize = bucketSize;
        this.bulldozerType = type;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
