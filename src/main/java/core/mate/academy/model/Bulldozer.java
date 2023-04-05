package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String name;
    private int height;
    private int length;

    public Bulldozer(String bullColor, int bullHeight, int bullLength) {
        this.name = bullColor;
        this.height = bullHeight;
        this.length = bullLength;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
