package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int sizeTruck;

    public Bulldozer(String name, String color, int sizeTruck) {
        super(name, color);
        this.sizeTruck = sizeTruck;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getSizeTruck() {
        return sizeTruck;
    }

    public void setSizeTruck(int sizeTruck) {
        this.sizeTruck = sizeTruck;
    }
}
