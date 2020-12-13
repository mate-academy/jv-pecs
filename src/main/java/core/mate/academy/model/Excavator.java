package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String typeOfBucket;

    public Excavator() {
    }

    public Excavator(String name, String color, String typeOfBucket) {
        super(name, color);
        this.typeOfBucket = typeOfBucket;
    }

    public String getTypeOfBucket() {
        return typeOfBucket;
    }

    public void setTypeOfBucket(String typeOfBucket) {
        this.typeOfBucket = typeOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
