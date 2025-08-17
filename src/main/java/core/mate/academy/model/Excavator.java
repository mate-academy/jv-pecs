package core.mate.academy.model;

public class Excavator extends Machine {
    private int diggerSize;
    private int diggerCapacity;

    public Excavator() {
    }

    public Excavator(int diggerSize, int diggerCapacity) {
        this.diggerSize = diggerSize;
        this.diggerCapacity = diggerCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getDiggerSize() {
        return diggerSize;
    }

    public void setDiggerSize(int diggerSize) {
        this.diggerSize = diggerSize;
    }

    public int getDiggerCapacity() {
        return diggerCapacity;
    }

    public void setDiggerCapacity(int diggerCapacity) {
        this.diggerCapacity = diggerCapacity;
    }
}
