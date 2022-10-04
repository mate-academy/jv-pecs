package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeScale;
    private int weight;

    public Bulldozer() {

    }

    public Bulldozer(int bladeScale, int weight) {
        this.bladeScale = bladeScale;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBladeScale() {
        return bladeScale;
    }

    public void setBladeScale(int bladeScale) {
        this.bladeScale = bladeScale;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
