package core.mate.academy.model;

public class Excavator extends Machine {
    double arrowLength;

    public Excavator() {

    }

    public Excavator(String name, String color, int power, double arrowLength) {
        super(name, color, power);
        this.arrowLength = arrowLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
