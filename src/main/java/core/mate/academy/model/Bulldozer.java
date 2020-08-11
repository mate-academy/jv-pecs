package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private int weight;
    private int maxScoopWeight;

    public Bulldozer() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxScoopWeight() {
        return maxScoopWeight;
    }

    public void setMaxScoopWeight(int maxScoopWeight) {
        this.maxScoopWeight = maxScoopWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
