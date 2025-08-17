package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int length;

    public Bulldozer() {
        super();
    }

    public Bulldozer(String name, String color, int length) {
        super(name, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
