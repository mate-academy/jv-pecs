package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String type;
    private int maxGrowWeight;

    public Bulldozer() {
    }

    public Bulldozer(String type, int maxGrowWeight) {
        this.type = type;
        this.maxGrowWeight = maxGrowWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxGrowWeight() {
        return maxGrowWeight;
    }

    public void setMaxGrowWeight(int maxGrowWeight) {
        this.maxGrowWeight = maxGrowWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
