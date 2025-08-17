package core.mate.academy.model;

public class Excavator extends Machine {
    private int sizeBucket;
    private String type;

    public Excavator() {
    }

    public int getSizeBucket() {
        return sizeBucket;
    }

    public void setSizeBucket(int sizeBucket) {
        this.sizeBucket = sizeBucket;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
