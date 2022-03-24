package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String markBulldozer;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String markBulldozer) {
        super(name, color);
        this.markBulldozer = markBulldozer;
    }

    public String getMarkBulldozer() {
        return markBulldozer;
    }

    public void setMarkBulldozer(String markBulldozer) {
        this.markBulldozer = markBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String toString() {
        return super.toString()
                + "markBulldozer='" + markBulldozer + "'}";
    }
}
