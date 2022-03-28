package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int countOfWheels;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int countOfWheels) {
        super(name, color);
        this.countOfWheels = countOfWheels;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
