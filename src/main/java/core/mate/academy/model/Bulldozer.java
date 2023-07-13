package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double dumpWidth;
    private String color;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
