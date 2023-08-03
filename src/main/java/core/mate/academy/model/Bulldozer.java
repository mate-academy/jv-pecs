package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeLength, int bladeWeight) {
        setName(name);
        setColor(color);
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
