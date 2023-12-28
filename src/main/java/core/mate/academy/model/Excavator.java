package core.mate.academy.model;

public class Excavator extends Machine {
    private String version;
    private boolean isBackBucket;

    public Excavator() {
    }

    public Excavator(boolean isBackBucket, String version) {
        this.isBackBucket = isBackBucket;
        this.version = version;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
