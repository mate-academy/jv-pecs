package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeOfBulldozerBucket;
    private int sizeOfBulldozerBucket;

    public Bulldozer() {
    }

    public Bulldozer(String type, int size) {
        this.sizeOfBulldozerBucket = size;
        this.typeOfBulldozerBucket = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
