package core.mate.academy.model;

public class Bulldozer extends Machine {
    String bladeType;
    int ripperSize;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
