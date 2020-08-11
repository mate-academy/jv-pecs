package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private int bladeLength;

    public Bulldozer() {
    }

    public Bulldozer(int weight, int bladeLength) {
        this.weight = weight;
        this.bladeLength = bladeLength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
