package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private int laddleWidth;

    public Bulldozer() {
    }

    public void setLaddleWidth(int laddleWidth) {
        this.laddleWidth = laddleWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
