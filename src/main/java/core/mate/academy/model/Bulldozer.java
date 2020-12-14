package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maximumShearWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int maximumShearWeight) {
        super(name, color);
        this.maximumShearWeight = maximumShearWeight;
    }

    public int getMaximumShearWeight() {
        return maximumShearWeight;
    }

    public void setMaximumShearWeight(int maximumShearWeight) {
        this.maximumShearWeight = maximumShearWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
