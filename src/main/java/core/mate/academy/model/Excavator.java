package core.mate.academy.model;

public class Excavator extends Machine {
    private int armLength;
    private boolean hasBucket;

    public Excavator() {
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public boolean hasBucket() {
        return hasBucket;
    }

    public void setHasBucket(boolean hasBucket) {
        this.hasBucket = hasBucket;
    }

    @Override
    public void startWorking() {
        System.out.println("Excavator is working.");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
