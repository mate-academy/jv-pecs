package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bucketType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bucketType) {
        super(name, color);
        this.bucketType = bucketType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
