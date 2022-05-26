package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int cost;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int cost) {
        setName(name);
        setColor(color);
        this.cost = cost;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}