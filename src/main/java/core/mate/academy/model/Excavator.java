package core.mate.academy.model;

public class Excavator extends Machine {
    private int sizeOfBucket;
    private int lengthCrane;

    public Excavator() {
    }

    public int getSizeOfBucket() {
        return sizeOfBucket;
    }

    public void setSizeOfBucket(int sizeOfBucket) {
        this.sizeOfBucket = sizeOfBucket;
    }

    public int getLengthCrane() {
        return lengthCrane;
    }

    public void setLengthCrane(int lengthCrane) {
        this.lengthCrane = lengthCrane;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
