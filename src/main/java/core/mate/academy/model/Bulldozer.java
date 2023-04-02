package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bullColor;
    private int bullHeight;
    private int bullLength;

    public Bulldozer(String bullColor, int bullHeight, int bullLength) {
        this.bullColor = bullColor;
        this.bullHeight = bullHeight;
        this.bullLength = bullLength;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
