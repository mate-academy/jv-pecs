package core.mate.academy.model;

public class Excavator extends Machine {
    private double arrowLength;

    public Excavator() {

    }

    public double getArrowLength() {
        return arrowLength;
    }

    public void setArrowLength(double arrowLength) {
        this.arrowLength = arrowLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
