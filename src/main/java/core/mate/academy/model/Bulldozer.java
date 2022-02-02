package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeLift;
    private int bladeDepth;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
