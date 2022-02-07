package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeLength, int bladeWeight) {
        this.setName(name);
        this.setColor(color);
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
