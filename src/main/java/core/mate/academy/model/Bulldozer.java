package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int intBulldozer;
    private String stringBulldozer;

    public Bulldozer(String name, String color, int intBulldozer, String stringBulldozer) {
        super(name, color);
        this.intBulldozer = intBulldozer;
        this.stringBulldozer = stringBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
