package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Bulldozer(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public Bulldozer() {}

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
