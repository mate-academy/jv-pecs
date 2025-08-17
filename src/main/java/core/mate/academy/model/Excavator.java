package core.mate.academy.model;

public class Excavator extends Machine {
    private int arrowLength;

    public Excavator() {
    }

    public int getArrowLength() {
        return arrowLength;
    }

    public void setArrowLength(int arrowLength) {
        this.arrowLength = arrowLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
