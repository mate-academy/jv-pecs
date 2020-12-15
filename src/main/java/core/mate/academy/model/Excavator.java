package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private static final int MAX_POSSIBLE_LOAD = 10_000;
    private int maxLoad;

    public Excavator() {
        Random rand = new Random();
        maxLoad = rand.nextInt(MAX_POSSIBLE_LOAD);
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
