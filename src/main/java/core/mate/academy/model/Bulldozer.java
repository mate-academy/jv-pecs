package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private int ripperSize;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
