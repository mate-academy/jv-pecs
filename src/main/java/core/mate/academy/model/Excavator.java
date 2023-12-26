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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean isBackBucket() {
        return isBackBucket;
    }

    public void setBackBucket(boolean backBucket) {
        isBackBucket = backBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
