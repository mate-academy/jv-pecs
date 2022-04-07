package core.mate.academy.model;

public class Excavator extends Machine {
    private String ledgeSize;

    public Excavator(String ledgeSize, String name, String color) {
        super(name, color);
        this.ledgeSize = ledgeSize;
    }

    public Excavator() {
    }

    public void setLedgeSize(String ledgeSize) {
        this.ledgeSize = ledgeSize;
    }

    public String getLedgeSize() {
        return ledgeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
