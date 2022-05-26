package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int cost;

    public Excavator() {
    }

    public Excavator(String name, String color, int cost) {
        setName(name);
        setColor(color);
        this.cost = cost;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
