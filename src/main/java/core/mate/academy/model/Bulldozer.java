package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private int caterpillarLength;

    public Bulldozer() {
    }

    private Bulldozer(int weight, int caterpillarLength) {
        this.weight = weight;
        this.caterpillarLength = caterpillarLength;
    }

    public static Bulldozer of(int weight, int caterpillarLength) {
        return new Bulldozer(weight, caterpillarLength);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCaterpillarLength() {
        return caterpillarLength;
    }

    public void setCaterpillarLength(int caterpillarLength) {
        this.caterpillarLength = caterpillarLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
