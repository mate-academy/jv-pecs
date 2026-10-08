package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
