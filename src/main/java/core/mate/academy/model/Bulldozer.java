package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSize;
    private String engineType;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
