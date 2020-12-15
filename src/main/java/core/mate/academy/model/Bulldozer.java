package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static final int MAX_PRODUCTIVITY = 1000;
    private int productivity;

    public Bulldozer() {
        Random rand = new Random();
        productivity = rand.nextInt(MAX_PRODUCTIVITY);
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity(int productivity) {
        this.productivity = productivity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
