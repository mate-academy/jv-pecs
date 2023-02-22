package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int dumpWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int dumpWidth) {
        super(name, color);
        this.dumpWidth = dumpWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getDumpWidth() {
        return dumpWidth;
    }

    public void setDumpWidth(int dumpWidth) {
        this.dumpWidth = dumpWidth;
    }
}
