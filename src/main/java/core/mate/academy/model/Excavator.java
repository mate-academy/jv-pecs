package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int sizeOfBucket;
    private String nameOfExcavator;

    public Excavator() {
    }

    public int getSizeOfBucket() {
        return sizeOfBucket;
    }

    public void setSizeOfBucket(int sizeOfBucket) {
        this.sizeOfBucket = sizeOfBucket;
    }

    public String getNameOfExcavator() {
        return nameOfExcavator;
    }

    public void setNameOfExcavator(String nameOfExcavator) {
        this.nameOfExcavator = nameOfExcavator;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
