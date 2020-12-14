package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements Workable {
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(int power, String color, String name) {
        this.power = power;
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
