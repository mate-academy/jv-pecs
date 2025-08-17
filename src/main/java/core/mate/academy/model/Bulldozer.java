package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double shovelVolume;
    private int dumpLength;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double shovelVolume, int dumpLength) {
        super(name, color);
        this.shovelVolume = shovelVolume;
        this.dumpLength = dumpLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
