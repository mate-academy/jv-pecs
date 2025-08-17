package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean hasCaterpillar;
    private int weight;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void setHasCaterpillar(boolean hasCaterpillar) {
        this.hasCaterpillar = hasCaterpillar;
    }

    public boolean isHasCaterpillar() {
        return hasCaterpillar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
