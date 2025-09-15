package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String make;
    private String model;
    private String excavatorBucket;

    public Excavator() {
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getExcavatorBucket() {
        return excavatorBucket;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setExcavatorBucket(String excavatorBucket) {
        this.excavatorBucket = excavatorBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
