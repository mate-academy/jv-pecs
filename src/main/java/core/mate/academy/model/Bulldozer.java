package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int capacity;

    public Bulldozer(String name, String color, int horsePower) {
        super(color, name);
        this.capacity = horsePower;
    }

    public Bulldozer() {
    }

    public int getHorsePower() {
        return capacity;
    }

    public void setHorsePower(int horsePower) {
        this.capacity = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
