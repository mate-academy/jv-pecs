package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeLength;

    public Bulldozer(String name, String color, int bladeLength) {
        super(name, color);
        this.bladeLength = bladeLength;
    }

    public Bulldozer() {
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
