package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private int housePower;

    public Bulldozer(int weight, int housePower) {
        this.weight = weight;
        this.housePower = housePower;
    }

    public Bulldozer() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHousePower() {
        return housePower;
    }

    public void setHousePower(int housePower) {
        this.housePower = housePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
