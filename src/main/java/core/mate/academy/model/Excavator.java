package core.mate.academy.model;

public class Excavator extends Machine {
    private int scoopCapacity;
    private int armLength;

    public Excavator(int scoopCapacity, int armLength, String name, String color) {
        super(name, color);
        this.scoopCapacity = scoopCapacity;
        this.armLength = armLength;
    }

    public Excavator() {
    }

    public int getScoopCapacity() {
        return scoopCapacity;
    }

    public void setScoopCapacity(int scoopCapacity) {
        this.scoopCapacity = scoopCapacity;
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
