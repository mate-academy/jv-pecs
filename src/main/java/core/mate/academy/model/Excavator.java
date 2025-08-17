package core.mate.academy.model;

public class Excavator extends Machine {
    private int digSpeed;

    public Excavator() {
    }

    public Excavator(int digSpeed) {
        this.digSpeed = digSpeed;
    }

    public int getDigSpeed() {
        return digSpeed;
    }

    public void setDigSpeed(int digSpeed) {
        this.digSpeed = digSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
