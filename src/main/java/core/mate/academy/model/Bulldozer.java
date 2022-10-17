package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeLength, int bladeWeight) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
