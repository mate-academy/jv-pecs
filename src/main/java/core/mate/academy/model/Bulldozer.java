package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public Bulldozer() {
        super("", "", "");
    }

    public Bulldozer(String name, String color, String serial) {
        super(name, color, serial);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
