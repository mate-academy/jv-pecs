package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucket;

    public Excavator() {
    }

    public Excavator(String name, String color, String bucket) {
        super(name, color);
        this.bucket = bucket;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
