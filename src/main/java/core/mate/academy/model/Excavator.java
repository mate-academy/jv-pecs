package core.mate.academy.model;

public class Excavator extends Machine {
    private int ledgeSize;

    public Excavator() {
    }

    public void setLedgeSize(int ledgeSize) {
        this.ledgeSize = ledgeSize;
    }

    public int getLedgeSize() {
        return ledgeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
