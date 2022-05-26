package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String dumpShape;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String dumpShape) {
        this.dumpShape = dumpShape;
        this.setColor(color);
        this.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getDumpShape() {
        return dumpShape;
    }

    public void setDumpShape(String dumpShape) {
        this.dumpShape = dumpShape;
    }
}
