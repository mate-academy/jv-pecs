package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeWidth;
    private boolean onTires;

    public Bulldozer() {
    }

    public Bulldozer(int bladeWidth, boolean onTheTires) {
        this.bladeWidth = bladeWidth;
        this.onTires = onTheTires;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
