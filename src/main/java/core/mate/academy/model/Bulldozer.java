package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String ripperType;
    private int serialNumOfRipper;
    private int penetrationForce;

    public Bulldozer() {
    }

    public Bulldozer(String ripperType, int serialNumOfRipper, int penetrationForce) {
        this.ripperType = ripperType;
        this.serialNumOfRipper = serialNumOfRipper;
        this.penetrationForce = penetrationForce;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
